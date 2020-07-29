package com.trinity.demospring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.trinity.demospring.entities.Adress;
import com.trinity.demospring.entities.Category;
import com.trinity.demospring.entities.City;
import com.trinity.demospring.entities.Client;
import com.trinity.demospring.entities.Product;
import com.trinity.demospring.entities.State;
import com.trinity.demospring.entities.enums.ClientType;
import com.trinity.demospring.repositories.AdressRepository;
import com.trinity.demospring.repositories.CategoryRepository;
import com.trinity.demospring.repositories.CityRepository;
import com.trinity.demospring.repositories.ClientRepository;
import com.trinity.demospring.repositories.ProductRepository;
import com.trinity.demospring.repositories.StateRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private AdressRepository adressRepository;

	@Override
	
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Informática");
		Category cat2 = new Category(null, "Escritório");
		
		Product prod1 = new Product(null, "Computer", 2000.00);
		Product prod2 = new Product(null, "Printer", 800.00);
		Product prod3 = new Product(null, "Mouse", 80.0);
		
		
		cat1.getProducts().addAll(Arrays.asList(prod1,prod2,prod3));
		cat2.getProducts().addAll(Arrays.asList(prod2));
		
		prod1.getCategories().addAll(Arrays.asList(cat1));
		prod2.getCategories().addAll(Arrays.asList(cat1, cat2));
		prod3.getCategories().addAll(Arrays.asList(cat1));
	
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
		productRepository.saveAll(Arrays.asList(prod1, prod2, prod3));
		
		State sta1 = new State(null, "Espiríto Santo");
		State sta2 = new State(null, "São Paulo");
		
		City cit1 = new City(null, "Vitória", sta1);
		City cit2 = new City(null, "Paulínia", sta2);
		City cit3 = new City(null, "Campinas", sta2);
		
		stateRepository.saveAll(Arrays.asList(sta1, sta2));
		cityRepository.saveAll(Arrays.asList(cit1, cit2, cit3));
		
		Client cli1 = new Client(null, "Maria Silva", "maria@gmail.com", "09978799980", ClientType.PHYSICALPERSON);
		cli1.getPhones().addAll(Arrays.asList("23328899", "99885465"));
		
		Adress ad1 =  new Adress(null, "Rua Santa Marta", "411", "apt 303", "Maruipe", "13144604", cli1, cit1);
		Adress ad2 = new Adress(null, "Avenida Matos", "105", "sala 800", "Centro", "13140000", cli1, cit2);
		
		cli1.getAdresses().addAll(Arrays.asList(ad1, ad2));
		
		clientRepository.saveAll(Arrays.asList(cli1));
		adressRepository.saveAll(Arrays.asList(ad1, ad2));
		
		
		
		

		
	}

}
