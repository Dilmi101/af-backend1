package com.example.service;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Category;
import com.example.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public BigDecimal calculateCharge(String categoryId) {
		
		Optional<Category> category = categoryRepository.findById(categoryId);
		if(category != null) {
			return category.get().getPrice();
		}else {
			return new BigDecimal(0.00);
		}

	}
}
