package com.newproject.manageservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newproject.manageservice.entity.Depart;
import com.newproject.manageservice.service.DeptServ;

@RestController
@RequestMapping("/departments")
public class DeptController {
	  @Autowired
	  private DeptServ depServ;

	     @PostMapping("/")
	     public Depart saveDepartment(@Validated @RequestBody Depart depart) {
	    	  System.out.println(depart+" successfull");

	          return depServ.saveDepartment(depart);

	     }

		@GetMapping("/{id}")
		public Depart findByDepartmentId(@PathVariable(value="id") Long departmentId) {
			return depServ.findByDepartmentId(departmentId);
		}
}
