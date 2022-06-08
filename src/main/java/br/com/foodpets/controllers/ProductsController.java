package br.com.foodpets.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.foodpets.model.Products;
import br.com.foodpets.services.ProductsServices;

@RestController
@CrossOrigin("*")
public class ProductsController {
    
    @Autowired
    private ProductsServices productsServices;

    @PostMapping("painel/products")
    public Products add(@RequestBody Products products) {
        return productsServices.save(products); 
    }

    @GetMapping("products")
    public List<Products> list() {
        return productsServices.list();
    }
    
}
