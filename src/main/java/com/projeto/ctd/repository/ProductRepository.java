package com.projeto.ctd.repository;

import com.projeto.ctd.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query
    public List<Product> findAllByCategory(Long id);
}