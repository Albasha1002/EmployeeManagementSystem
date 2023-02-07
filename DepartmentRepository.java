package com.managementcode.Department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.managementcode.Department.entity.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
       
}
