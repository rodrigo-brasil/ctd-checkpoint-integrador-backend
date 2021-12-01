package com.projeto.ctd.controller;

import com.projeto.ctd.models.Category;
import com.projeto.ctd.models.Product;
import com.projeto.ctd.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoriesController {

    @Autowired
    private IService<Category> service;

    @GetMapping("/products/categories")
    public ResponseEntity<List<Category>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

}
