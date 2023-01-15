package com.oms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.oms.entity.Order;
import com.oms.service.OrderService;

import jakarta.validation.Valid;


@RestController
public class OrderController { //front end
	@Autowired
	OrderService orderService; //dependency Injection ( spring is creating the object) 
	@PostMapping("/order")
	String createOrder(@RequestBody @Valid Order order, BindingResult bindingresult) {
		if(bindingresult.hasErrors()) {
			throw new IllegalArgumentException("Invalid Data");
		}
		System.out.println(order);
		return orderService.createOrder(order);
		//System.out.println(order.getItem());
		//System.out.println(order.getPrice());
		}
	@GetMapping("/order")
	String getOrder() {
		return "Order Created";
	}
//id is a path param hence we use path variable 	
	@PostMapping("/order/{id}") 
	String updateOrder(@PathVariable("id") int orderId){
		System.out.println(orderId);
		return "Order updated";
	}
	

    @DeleteMapping("/order/{id}")	
	String deleteOrder(@PathVariable("id") String orderId){
    	System.out.println(orderId);
		return "Order deleted";
		
	}
	

}




