package com.newproject.manageservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.newproject.manageservice.entity.Depart;
@Repository
public interface DeptRepo extends JpaRepository<Depart, Long>{

	Depart findByDepartmentId(Long departmentId);



}
