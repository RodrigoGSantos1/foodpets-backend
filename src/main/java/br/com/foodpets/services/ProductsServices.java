package br.com.foodpets.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.foodpets.model.Products;
import br.com.foodpets.repository.productsRepository;

@Service
public class ProductsServices {

    @Autowired
    private productsRepository productsRepository;

    public Products save(Products user) {
        return productsRepository.save(user);
    }

    public List<Products> list() {
        return this.productsRepository.findAll();
    }
    
}
