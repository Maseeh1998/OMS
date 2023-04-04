package com.oms.service;



import java.util.List;
import java.util.Optional;

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
		return orderRepository.findAll();
	}

	public void updateOrder(Order order) {
		orderRepository.save(order);	
	}
	
	public void deleteOrder(String orderId) {
		orderRepository.deleteById(orderId);
		
	}

	public Optional<Order> getOrder(String orderId) {
		return orderRepository.findById(orderId);
	}

	
	
	
}
