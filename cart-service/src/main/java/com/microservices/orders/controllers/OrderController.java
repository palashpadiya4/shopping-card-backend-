package com.microservices.orders.controllers;



import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.microservices.orders.model.Order;
import com.microservices.orders.services.OrderService;

import java.util.List;

@RestController
@RequestMapping("/cart")
@CrossOrigin(origins="http://localhost:4200")
public class OrderController {
	
	@Autowired
	private OrderService OrderService;

	
	@PostMapping("/add")
	@Operation(description = "Add Order")
	@ApiResponse(responseCode = "200" , description = "Order added successfully")
	@ApiResponse(responseCode = "400" , description = "Bad Request: Something went wrong")
	public String addNeworder( @RequestBody Order order ){
			return OrderService.addorder( order );		
	}

	@GetMapping("/allorders")
	@Operation(description = "Get Order")
	@ApiResponse(responseCode = "200" , description = "Order fetched successfully")
	@ApiResponse(responseCode = "400" , description = "Bad Request: Occurs when order isn't present!!")
	public List<Order> fetchAllProducts(){
		return  OrderService.fetchAllOrders();
	}


	@PutMapping("/updateProduct")
	@Operation(description = "Update Product")
	@ApiResponse(responseCode = "200" , description = "Product Updated successfully")
	@ApiResponse(responseCode = "400" , description = "Bad Request: Occurs when product isn't Updated!!")
	public Order updateProduct(@RequestBody  Order order){

		return  OrderService.update(order);
	}

	@DeleteMapping("/deleteProduct/{id}")
	@Operation(description = "Delete Product")
	@ApiResponse(responseCode = "200" , description = "Product deleted successfully")
	@ApiResponse(responseCode = "400" , description = "Bad Request: Occurs when product isn't deleted!!")
	 public String deleteProductById(@PathVariable("id") String id)
	 {
		OrderService.deleteById(id);
		return "id no "+id+" is deleted";
	 }

	@GetMapping ("/{id}")

	public String fetchProductById(@PathVariable("id") String id)
	{
		OrderService.fetchById(id);
		return id;
	}

}
