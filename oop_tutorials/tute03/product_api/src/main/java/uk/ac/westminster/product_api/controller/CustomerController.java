/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.westminster.product_api.controller;

import uk.ac.westminster.product_api.dto.Address;
import uk.ac.westminster.product_api.dto.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author thidass
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable long id) {
        Address address = new Address("115 New Cavendish Street", "London", "W1W 6UW");
        return new Customer(id, "Ada Lovelace","ada@example.com", address); 
    }
}
