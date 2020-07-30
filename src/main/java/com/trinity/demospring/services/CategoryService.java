package com.trinity.demospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trinity.demospring.entities.Category;
import com.trinity.demospring.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
		
	}
		
	/*public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Category.class.getName()));
	}
	*/
	
	public Category findById(Long id) {
		Optional<Category> obj =  repository.findById(id);
		return obj.get();
	}
	
	public Category insert(Category obj) {
		return repository.save(obj);
	}
	

}
