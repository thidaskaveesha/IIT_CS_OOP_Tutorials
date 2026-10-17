/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.westminster.product_api.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import uk.ac.westminster.product_api.dto.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.ac.westminster.product_api.service.ProductService;

/**
 *
 * @author thidass
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    
    @Autowired
    private ProductService productService; 

    @GetMapping("")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id){
        return productService.getProductById(id).orElse(null); 
    }
    
    @GetMapping("/search/{name}")
    public Product searchByName(@PathVariable String name){
        return productService.findByName(name).orElse(null); 
    }
            
    @PostMapping("/add-product")
    public Product insertProduct(@RequestBody Product product) {
        return productService.addProduct(product); 
    }
    
    @DeleteMapping("/{id}")
    public String deleteProductById(@PathVariable Long id){
        Boolean isDeleted = false; 
        isDeleted = productService.deleteProductById(id); 
        if(isDeleted){
            return "Product ID: "+ id.toString() + " Deleted Successfully!"; 
        }else {
            return "Product ID: "+ id.toString() + " Deletion Unsucessfull!";
        }
    }
}
