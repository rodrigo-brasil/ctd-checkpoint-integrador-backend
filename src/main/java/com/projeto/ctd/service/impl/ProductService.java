package com.projeto.ctd.service.impl;

import com.projeto.ctd.models.Product;
import com.projeto.ctd.repository.ProductRepository;
import com.projeto.ctd.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IService<Product> {

    @Autowired
    ProductRepository repository;

    @Override
    public List<Product> getAll() {
        return repository.findAll();
    }

    @Override
    public Product getById(Long id) {
        return repository.getById(id);
    }

    @Override
    public List<Product> getAllByType(String type) {
        return repository.findAllByCategory(type);
    }
}
