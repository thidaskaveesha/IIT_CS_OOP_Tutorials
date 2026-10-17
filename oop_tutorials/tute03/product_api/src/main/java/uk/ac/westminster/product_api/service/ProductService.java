/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.westminster.product_api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import uk.ac.westminster.product_api.dto.Product;

/**
 *
 * @author thidass
 */
@Service
public class ProductService {
    
    private List<Product> products = new ArrayList<>(); 
    private Long nextId = 1L; 
    
    public List<Product> getAllProducts(){
        return products;
    }
    
    public Product addProduct(Product product){
        product.setId(nextId++);
        products.add(product);
        return product; 
    }
    
    public Optional<Product> getProductById(Long id){
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();  
    }
    
    public Boolean deleteProductById(Long id){
        return products.removeIf(p -> p.getId().equals(id)); 
    }
    
    public Optional<Product> findByName(String name){
        return products.stream()
                .filter(p -> p.getName().toLowerCase().contains(name.toLowerCase()))
                .findFirst(); 
    }
}
