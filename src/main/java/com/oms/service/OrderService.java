package com.oms.service;
import org.springframework.stereotype.Service;
import com.oms.entity.Order;

@Service
public class OrderService {
	public String createOrder(Order order) {
		return " Order Created ";
		
	}
}
