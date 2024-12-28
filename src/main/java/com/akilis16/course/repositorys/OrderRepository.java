package com.akilis16.course.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akilis16.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
