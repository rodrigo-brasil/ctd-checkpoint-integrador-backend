package com.projeto.ctd.repository;

import com.projeto.ctd.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}