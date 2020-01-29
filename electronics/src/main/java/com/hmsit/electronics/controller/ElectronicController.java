package com.hmsit.electronics.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hmsit.electronics.model.Category;
import com.hmsit.electronics.model.repository.CategoryRepository;

@Controller
public class ElectronicController {
	
	@Autowired
	CategoryRepository repoCat;

	@GetMapping("/")
	public String getHomePage() {
		
		return "home";
	}
	
	@GetMapping("/categories")
	public String getCategoriesPage(Model model) {
		
		List<Category> categories = repoCat.findAll();
		
		model.addAttribute("categories",categories);
		
		return "categories";
	}
}
