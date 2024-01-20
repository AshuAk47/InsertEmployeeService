package com.spring.insert.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.insert.model.Emp;
import com.spring.insert.model.EmpRepository;

@RestController
@RequestMapping("/employee")
public class InsertEmpController {
	@Autowired
	EmpRepository edao;
	





	@GetMapping("/insert")
	public String addEmp(@RequestParam("eid") int eid, @RequestParam("ename") String ename,@RequestParam("esalary") int esalary) {
		Emp e = new Emp(eid, ename,esalary);
		edao.save(e);
		return "success";

	}
}

