package com.akilis16.course.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akilis16.course.entities.OrderItem;
import com.akilis16.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
