package com.codingdojo.ManyToMany.controllers;

import java.util.ArrayList;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.codingdojo.ManyToMany.models.Product;
import com.codingdojo.ManyToMany.services.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
	private ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping("")
	public String newproducts(Model model) {
		model.addAttribute("product", new Product());
		
		ArrayList<Product> products = productService.all();
		model.addAttribute("products",products);
		return "products";
	}
	
	@PostMapping("")
	public String create( @Valid @ModelAttribute("product") Product product, BindingResult res ){
		if(res.hasErrors())	{
			return "products";
		}
		productService.create(product);
		return "redirect:/products";
	}
	
	@PostMapping("/{id}")
	public String destroy(@PathVariable("id") Long id) {
		productService.destroy(id);
		return "redirect:/products";
	}
}