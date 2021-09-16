package com.HelloWorld.springdemohelloworld.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HelloWorld.springdemohelloworld.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
