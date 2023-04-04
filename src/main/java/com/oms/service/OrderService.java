package com.oms.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.oms.entity.Order;
import com.oms.repo.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;
	public String createOrder(Order order) {
		Order savedorder = orderRepository.save(order);
		return savedorder.getId();
		
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
