package com.example.product;

import java.util.List;
import java.util.Map;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Slf4j
class ProductDAO_Test {

	@Autowired
	private ProductDAO productDAO;

	@Test
	@Order(1)
	void test() {
		List<Map<String, Object>> list = productDAO.list();
		log.info("list size : {}", list.size());
	}

}
