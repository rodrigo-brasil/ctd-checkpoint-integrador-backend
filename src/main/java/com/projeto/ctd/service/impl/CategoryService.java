package com.projeto.ctd.service.impl;

import com.projeto.ctd.models.Category;
import com.projeto.ctd.repository.CategoryRepository;
import com.projeto.ctd.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements IService<Category> {

    @Autowired
    CategoryRepository repository;

    @Override
    public List<Category> getAll() {
        return repository.findAll();
    }

    @Override
    public Category getById(Long id) {
        return repository.getById(id);
    }

    @Override
    public List<Category> getAllByType(String type) {
        return null;
    }
}
