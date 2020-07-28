package com.trinity.demospring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.trinity.demospring.entities.Category;
import com.trinity.demospring.repositories.CategoryRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Informática");
		Category cat2 = new Category(null, "Escritório");
		
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
	}

}
