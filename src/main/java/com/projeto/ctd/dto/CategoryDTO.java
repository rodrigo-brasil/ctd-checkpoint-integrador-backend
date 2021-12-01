package com.projeto.ctd.dto;

import com.projeto.ctd.models.Category;
import lombok.Data;

@Data
public class CategoryDTO {

    private String name;

    public static CategoryDTO categoryToDTO(Category category){
        CategoryDTO dto = new CategoryDTO();
        dto.setName(category.getName());
        return dto;
    }
}
