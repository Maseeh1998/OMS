package com.oms;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.oms.entity.Order;


@RestController
public class OrderController {
	@PostMapping("/order")
	String createOrder(@RequestBody Order order) {
		System.out.println(order.getItem());
		System.out.println(order.getPrice());
		return "Success";
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




