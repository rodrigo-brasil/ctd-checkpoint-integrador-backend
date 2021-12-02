package com.projeto.ctd.controller;

import com.projeto.ctd.dto.CategoryDTO;
import com.projeto.ctd.models.Category;
import com.projeto.ctd.models.Product;
import com.projeto.ctd.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CategoriesController {

    @Autowired
    private IService<Category> service;

    @GetMapping("/products/categories")
    public ResponseEntity<List<String>> getAll(){
        return ResponseEntity.ok(
                service.getAll().stream().map( CategoryDTO::categoryToDTO).map( c -> c.getName()).collect(Collectors.toList())
        );
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<String>> getCategory(@PathVariable String category){
        return ResponseEntity.ok(
                service.getAllByType(category).stream().map(category1 -> category1.getName()).collect(Collectors.toList())
        );
    }
}
