package com.techpalle.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techpalle.restapi.entity.Product;

@Repository

public interface InventoryRepository extends JpaRepository<Product, Integer>
{

}
