package com.oms.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.oms.entity.Order;

@Service
public class OrderService {
	public String createOrder(Order order) {
		return " Order Created ";
		
	}

	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return new ArrayList<Order>();
	}

	public void updateOrder(int orderId) {
		// TODO Auto-generated method stub
		System.out.println("Order updated");
		
	}

	public void deleteOrder(int orderId) {
		// TODO Auto-generated method stub
		System.out.println("Deleted the order");
	}

	public Order getOrder() {
		// TODO Auto-generated method stub
		return new Order();
	}

	
	
	
}
