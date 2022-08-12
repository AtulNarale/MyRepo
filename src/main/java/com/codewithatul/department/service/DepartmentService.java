package com.codewithatul.department.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithatul.department.entity.Department;
import com.codewithatul.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		log.info("insdide savedepartment of department service");
		return departmentRepository.save(department);
	}

	
	  public Department findDepartmentById(Long id) {
	  log.info("insdide finddepadepartment of department service"); return
	  departmentRepository.findDepartmentById(id); }
	 
	
}
