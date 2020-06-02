package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping()
    public String index() {
        return "index";
    }

    @GetMapping("/customer")
    public ModelAndView moveCustomerPage() {
        ModelAndView modelAndView = new ModelAndView("customer");
        List<Customer> customers = customerService.getAllCustomer();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/addCustomer")
    public ModelAndView moveAddCustomerPage() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/addCustomer")
    public ModelAndView addCustomer(@ModelAttribute Customer customer) {
        ModelAndView modelAndView = new ModelAndView("info");
        customerService.saveCustomer(customer);
        modelAndView.addObject("id", customer.getId());
        modelAndView.addObject("name", customer.getName());
        modelAndView.addObject("phone", customer.getPhoneNumber());
        return modelAndView;
    }
}