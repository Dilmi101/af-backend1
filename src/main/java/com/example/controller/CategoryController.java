package com.example.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.service.CategoryService;

@Controller
@CrossOrigin("*")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@PostMapping("/api/calculateCharge")
	public BigDecimal getCalculatedCharge(@RequestBody Calculator calculator) {
		return categoryService.calculateCharge(calculator.getCategoryId()).multiply(new BigDecimal(calculator.getDuration()));
	}
}
