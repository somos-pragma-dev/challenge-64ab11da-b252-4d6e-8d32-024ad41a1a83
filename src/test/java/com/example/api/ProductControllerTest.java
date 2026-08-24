package com.example.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProductControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testGetAllProducts() {
        ResponseEntity<String> response = restTemplate.getForEntity("/products", String.class);
        assert response.getStatusCode() == HttpStatus.OK;
    }

    @Test
    void testGetProductById() {
        ResponseEntity<String> response = restTemplate.getForEntity("/products/1", String.class);
        assert response.getStatusCode() == HttpStatus.OK;
    }

    @Test
    void testCreateProduct() {
        Product product = new Product("Product 1", 10.0, "Description 1");
        ResponseEntity<String> response = restTemplate.postForEntity("/products", product, String.class);
        assert response.getStatusCode() == HttpStatus.CREATED;
    }

    @Test
    void testUpdateProduct() {
        Product product = new Product("Updated Product", 15.0, "Updated Description");
        ResponseEntity<String> response = restTemplate.put("/products/1", product, String.class);
        assert response.getStatusCode() == HttpStatus.OK;
    }

    @Test
    void testDeleteProduct() {
        ResponseEntity<Void> response = restTemplate.delete("/products/1");
        assert response.getStatusCode() == HttpStatus.NO_CONTENT;
    }
}