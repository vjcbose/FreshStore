package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Order;

@Service
public interface OrderService {
	 void createOrder(Order order);

}
