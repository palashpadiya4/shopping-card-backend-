package com.shoppingcart;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.shoppingcart.model.Product;
import com.shoppingcart.repository.ProductRepo;
import com.shoppingcart.services.ProductServiceImpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class ProductServiceApplicationTests {

	List<Product> products = new ArrayList<>();
	Product product;
	Product product1;

	@Autowired
	private ProductServiceImpl productserviceImpl;

	@MockBean
	private ProductRepo productRepo;
	
	
	@BeforeEach
    public void setproductservice(){

		product = new Product();
		product.setName("Mobile");
		product.setProduct_id(1);
		product.setPrice(90000);
		product.setCategory("Electronics");
		product.setDescription("It is a electronic device");

		products.add(product);

		product.setName("panda");
		product.setProduct_id(33);
		product.setPrice(8999);
		product.setCategory("stufftoy");
		product.setDescription("This is a toy product");
		
	    product.setProduct_id(1);
		products.add(product);
		
	}


	@Test
	void contextLoads() {
	}

    @Test
	public void setProductTest(){

		Mockito.when(productRepo.save(product)).thenReturn(product);
		
		Assertions.assertEquals(productserviceImpl.setProductDetails(product), product);

	
	}
    
	@Test
	public void getAllProducts(){

		Mockito.when(productRepo.findAll()).thenReturn(products);
		assertEquals(productserviceImpl.getAllProducts(), products);

        
	}
    
    @Test
	public void updateProductTest() {
		Mockito.when(productRepo.save(product)).thenReturn(product);
		product.setProduct_id(83);
		Assertions.assertEquals(productserviceImpl.updateProductById(product), product);

	}
	



}
