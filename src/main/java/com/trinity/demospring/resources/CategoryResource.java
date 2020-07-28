package com.trinity.demospring.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trinity.demospring.entities.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@GetMapping
	public List<Category> list() {
		Category cat = new Category(null, "TI");
		Category cat2 = new Category(null, "Office");

		List<Category> list = new ArrayList<>();
		list.add(cat);
		list.add(cat2);

		return list;

	}

}
