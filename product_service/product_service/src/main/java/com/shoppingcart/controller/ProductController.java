package com.shoppingcart.controller;

import java.util.List;
import java.util.Optional;

import com.shoppingcart.model.Product;
import com.shoppingcart.services.ProductServiceImpl;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins="http://localhost:4200")
public class ProductController {
    
    @Autowired
    private ProductServiceImpl productServiceImpl;

    @GetMapping("/list")
    public ResponseEntity<List<Product>> getAllProducts(){
        try{
            return ResponseEntity.of(Optional.of(productServiceImpl.getAllProducts()));
            
        }catch(Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

        }
    }
    @GetMapping("/{id}")
    @Operation(description = "Get Order")
    @ApiResponse(responseCode = "200" , description = "Order fetched successfully")
    @ApiResponse(responseCode = "400" , description = "Bad Request: Occurs when order isn't present!!")
    public ResponseEntity<Product> getProductById(@PathVariable("id")long id){
        try{
            return ResponseEntity.ok().body(productServiceImpl.getAllProductById(id));

        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

            
        }
    }
    Logger logger = LoggerFactory.getLogger(ProductController.class);
    @PostMapping("/add")
    @Operation(description = "Add Order")
    @ApiResponse(responseCode = "200" , description = "Order added successfully")
    @ApiResponse(responseCode = "400" , description = "Bad Request: Something went wrong")
    public ResponseEntity<Product> setAllProducts(@RequestBody Product product){
        try{
            return ResponseEntity.ok().body(productServiceImpl.setProductDetails(product));

        }catch(Exception e){
            logger.info("info message added");
            logger.warn(" warn message added");

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

        }

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Product> updateProductById(@PathVariable("id")long id, @RequestBody Product product){
        try{
            List<Product> products = productServiceImpl.getAllProducts();
            for(Product p: products){
                if(p.getProduct_id()==id){
                    return ResponseEntity.ok().body(productServiceImpl.updateProductById(product));
                }
            }
            throw new Exception("Product Details with id: " + id + " not Found!!");

        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBookingById(@PathVariable("id")long id){
        try{
            List<Product> products = productServiceImpl.getAllProducts();
            for(Product p: products){
                if(p.getProduct_id()==id){

                    productServiceImpl.deleteProductById(id);

                    return ResponseEntity.ok().body("Product Details Deleted Successfully!");
                }
            }
            throw new Exception("Product Details with id: " + id + " not Found!!");
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

}
