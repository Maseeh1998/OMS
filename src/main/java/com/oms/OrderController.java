package com.oms;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.oms.entity.Order;
import com.oms.service.OrderService;

import jakarta.validation.Valid;

@RestController
public class OrderController { // front end
	@Autowired
	OrderService orderService; // dependency Injection ( spring is creating the object)
	private void validateModel(Errors bindingresult) {
		if (bindingresult.hasErrors()) {
			throw new IllegalArgumentException("Invalid Data, Something went wrong!");
		}
		
	}
	@PostMapping("/order")
	@ResponseStatus(code = HttpStatus.CREATED)
	String createOrder(@RequestBody @Valid Order order, BindingResult bindingresult) {
		validateModel(bindingresult);
		System.out.println(order);
		return orderService.createOrder(order);
		//System.out.println(order.getItem());
		// System.out.println(order.getPrice());
	}

	@GetMapping("/order")
	List <Order> getOrders() {
		return orderService.getOrders();
	}
	
	@GetMapping("/order/{id}")
	Optional<Order> getOrder(@PathVariable("id") String orderId) {
		return orderService.getOrder(orderId);
	}

//id is a path param hence we use path variable 	
	@PutMapping("/order/{id}")
	void updateOrder(@RequestBody @Valid Order order, @PathVariable("id") String orderId, BindingResult bindingresult) {
		 validateModel(bindingresult);
		 System.out.println(orderId);
		 order.setId(orderId);
		 orderService.updateOrder(order);
	}

	@DeleteMapping("/order/{id}")
	 void deleteOrder(@PathVariable("id") String orderId) {
		System.out.println(orderId);
		//return orderService.deleteOrder();
		orderService.deleteOrder(orderId);

	}

}
