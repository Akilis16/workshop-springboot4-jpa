package com.akilis16.course.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akilis16.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
