/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.westminster.product_api.controller;

import java.time.LocalDate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author thidass
 */
@RestController
public class APIStatus {
    @GetMapping("/hello")
    public String Hello(){
        return "Hello from Spring boot!"; 
    }
    
    @GetMapping("/status")
    public String Status()
    {
        return "API is running - " + LocalDate.now().toString();
    }
}
