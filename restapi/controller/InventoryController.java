package com.techpalle.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techpalle.restapi.entity.Product;
import com.techpalle.restapi.service.InventoryService;

@RestController
@RequestMapping("/api/v1")

public class InventoryController {

	private final InventoryService service;
	
	@Autowired
	
	public InventoryController(InventoryService service)
	{
		this.service = service;
		
	}
	@PostMapping("/save")
	public ResponseEntity<Product> m1(@RequestBody Product p)
	{
		Product obj = service.m1(p);
		return  ResponseEntity.ok(obj);
	}
	
	@GetMapping("/read")
	public List<Product> readallproduct()
	{
		List<Product> products = service.readallproduct();
		return products;
		
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product p) {
	    Product updatedProduct = service.updateProduct(id, p);
	    return ResponseEntity.ok(updatedProduct);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable int id) {
	    service.deleteProduct(id);
	    return ResponseEntity.ok("Product deleted successfully");
	}
}
