package com.projeto.ctd.service.impl;

import com.projeto.ctd.exception.ResourceNotFoundException;
import com.projeto.ctd.models.Category;
import com.projeto.ctd.models.Product;
import com.projeto.ctd.repository.CategoryRepository;
import com.projeto.ctd.repository.ProductRepository;
import com.projeto.ctd.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IService<Product> {

    @Autowired
    ProductRepository repository;

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Product> getAll() {
        return repository.findAll();
    }

    @Override
    public Product getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Produto não encontrado"));
    }

    @Override
    public List<Product> getAllByName(String name) {
        List<Category> categories = categoryRepository.findByNameLikeIgnoreCase(name);
        if (categories.isEmpty())
            throw new ResourceNotFoundException("Categoria não existe");
        Long idCategory = categories.get(0).getId();
        return repository.findByCategoryId(idCategory);
    }

}