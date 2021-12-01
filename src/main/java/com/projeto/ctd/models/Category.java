package com.projeto.ctd.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Category {

    @Id
    private Long id;

    private String name;

    @OneToMany
    List<Product> products;


    public Category(String name) {
        this.name = name;
    }
}
