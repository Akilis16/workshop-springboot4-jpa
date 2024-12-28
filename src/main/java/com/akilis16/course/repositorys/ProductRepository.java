package com.akilis16.course.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akilis16.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
