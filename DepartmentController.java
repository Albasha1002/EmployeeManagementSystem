package com.managementcode.Department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.managementcode.Department.entity.Department;
import com.managementcode.Department.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	@PostMapping("/")
	public Department saveDepartment(Department department) {
		return departmentService.saveDepartment(department);
	}
	

}
