package com.order;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

//https://github.com/ibmpariwesh/citi-may30

@RestController
public class OrderController extends BaseController {

	@Autowired
	OrderService orderService;
	
	@PostMapping("order")
	@ResponseStatus(code = HttpStatus.CREATED)
	void createOrder(@Valid @RequestBody OrderVO order) {
		
		orderService.saveOrder(order);
		System.out.println(order.getItem());
		System.out.println(order.getQuantity());
		
		
	}
	
	@GetMapping("getOrders")
	public List<OrderVO> getOrders() {
		return orderService.getOrders();
	}
}
