package com.projeto.ctd.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Data
@Entity
@AllArgsConstructor
public class Product {

    @Id
    private Long id;

    private Double price;
    private String title, description, image;

    @OneToOne
    Category category;
}
