package com.projeto.ctd.dto;

import com.projeto.ctd.models.Product;
import lombok.Data;

@Data
public class ProductDTO {

    private Long id;
    private String title;
    private Double price;
    private String category, description, image;

    public static ProductDTO productToDTO(Product product){
        ProductDTO p = new ProductDTO();
        p.setId(product.getId());
        p.setTitle(product.getTitle());
        p.setPrice(product.getPrice());
        p.setCategory(product.getCategory().getName());
        p.setDescription(product.getDescription());
        p.setImage(product.getImage());
        return p;
    }

}
