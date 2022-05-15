package com.pool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/product")
public class ProductController {

	@Autowired
	private Environment env;
	
	@PostMapping("/create")
	public String createProduct() {
		return "Product Created";
	}

	@GetMapping("/getproduct")
	public String getProduct() {
		return "product port:"+env.getProperty("server.port");
	}

	@DeleteMapping("/delete")
	public String deleteProduct() {
		return "Delete Product";
	}

	@PutMapping("/update")
	public String updateeProduct() {
		return "Delete Product";
	}
}
