package br.com.foodpets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.foodpets.model.Products;

public interface productsRepository extends JpaRepository<Products, Long>  {
    
}
