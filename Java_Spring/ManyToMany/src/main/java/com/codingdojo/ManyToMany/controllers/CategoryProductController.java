package com.codingdojo.ManyToMany.controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.codingdojo.ManyToMany.models.Category;
import com.codingdojo.ManyToMany.models.Product;
import com.codingdojo.ManyToMany.services.CategoryService;
import com.codingdojo.ManyToMany.services.ProductService;

@Controller
@RequestMapping("/join")
public class CategoryProductController {
	private ProductService productService;
	private CategoryService categoryService;

	public CategoryProductController(ProductService productService,CategoryService categoryService) {
		this.productService = productService;
		this.categoryService = categoryService;
	}

	@GetMapping("")
	public String show(Model model){
		model.addAttribute("categories",categoryService.all());
		model.addAttribute("products",productService.all());
		return "join";
	}

	@PostMapping("")
	public String join( @RequestParam("productId") Long productId, @RequestParam("categoryId") Long categoryId ){

		Category category = categoryService.findOne(categoryId);
		
		Product product = productService.findOne(productId);
		product.setId(productId);

		// All categories that belong to THIS ONE product.
		List<Category> categories =  product.getCategories();
		categories.add(category);
		product.setCategories(categories);
		productService.update(product);

		return "redirect:/join";
	}
}