package kr.re.kitri.todolist.controller;

import kr.re.kitri.todolist.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KitriMallController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/orders")
    public String doOrders() {
        orderService.doOrder();
        return "";
    }
}
