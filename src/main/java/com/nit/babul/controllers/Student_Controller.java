package com.nit.babul.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nit.babul.entity.Student;
import com.nit.babul.repository.Student_Repo;


@Controller
public class Student_Controller {

	@Autowired
	private Student_Repo repo;
	@GetMapping("/getAll")
	public String getAll(Model model) {
		List<Student>student =repo.findAll();
		model.addAttribute( "student", student);
		
		
		return "record";
	}
}
