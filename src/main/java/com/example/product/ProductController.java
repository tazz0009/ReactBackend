package com.example.product;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping("/list")
	public List<Map<String, Object>> list() {
		return productDAO.list();
	}

}
