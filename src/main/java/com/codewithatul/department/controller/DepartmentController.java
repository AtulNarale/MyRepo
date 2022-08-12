package com.codewithatul.department.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithatul.department.entity.Department;
import com.codewithatul.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("inside save method of department controller");
		return departmentService.saveDepartment(department);
		
	}
	
	
	  @GetMapping("/{id}")
	  public Department findDepartmentById(@PathVariable ("id") Long id) {
	  log.info("find departmentbyid method of departmentcontroller "); 
	  return departmentService.findDepartmentById(id);
	  
	  }
	 
	
}
