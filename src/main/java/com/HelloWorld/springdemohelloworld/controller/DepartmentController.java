package com.HelloWorld.springdemohelloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.HelloWorld.springdemohelloworld.entity.Department;
import com.HelloWorld.springdemohelloworld.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentservice;
	
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department)
	{
		return departmentservice.saveDepartment(department);
	}
}
