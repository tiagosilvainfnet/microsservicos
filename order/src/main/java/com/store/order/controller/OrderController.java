package com.store.order.controller;

import com.store.order.domain.Order;
import com.store.order.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/order")
public class OrderController extends GenericController<Order>{
    public OrderController(OrderService service){ super(service); }
}
