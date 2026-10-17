/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.westminster.product_api.dto;

/**
 *
 * @author thidass
 */
public class Customer {
    private long id; 
    private String name; 
    private String email; 
    private Address address; 
    
    public Customer(){}
    
    public Customer (long id, String name, String email, Address address){
        this.id = id; 
        this.name = name; 
        this.email = email; 
        this.address = address; 
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
