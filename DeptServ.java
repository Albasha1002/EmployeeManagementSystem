package com.newproject.manageservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newproject.manageservice.entity.Depart;
import com.newproject.manageservice.repository.DeptRepo;

@Service
public class DeptServ implements DepartmentService {
	@Autowired
	private DeptRepo deptRepo;


	@Override
	public Depart saveDepartment(Depart department) {
		// TODO Auto-generated method stub
		return deptRepo.save(department);
	}


	public Depart findByDepartmentId(Long departmentId) {
		// TODO Auto-generated method stub
		return deptRepo.findByDepartmentId(departmentId);
	}



}
