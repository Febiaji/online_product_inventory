package com.techpalle.restapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techpalle.restapi.entity.Product;
import com.techpalle.restapi.repository.InventoryRepository;

@Service

public class InventoryService {
	
	private final InventoryRepository repository ;
	
	@Autowired
	
	public InventoryService(InventoryRepository repository)
	{
		this.repository= repository;
	}
	
	public Product m1(Product p)
	{
		Product obj = repository.save(p);
		return obj;
		
	}
	
	public List<Product> readallproduct()
	{
		List<Product> products = repository.findAll();
		return products;
		
	}

	public Product updateProduct(int id, Product newProductData) {
	    Optional<Product> optionalProduct = repository.findById(id);

	    if (optionalProduct.isPresent()) {
	        Product existingProduct = optionalProduct.get();
	        
	        // Update fields
	        existingProduct.setPname(newProductData.getPname());
	        existingProduct.setPrice(newProductData.getPrice());
	        existingProduct.setQuantity(newProductData.getQuantity());

	        return repository.save(existingProduct);
	    } else {
	        throw new RuntimeException("Product not found with ID: " + id);
	    }
	}


	public void deleteProduct(int id) {
		
		    if (repository.existsById(id)) {
		        repository.deleteById(id);
		    } else {
		        throw new RuntimeException("Product not found with ID: " + id);
		    }
		}

		
	}


