package com.akilis16.course.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akilis16.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
