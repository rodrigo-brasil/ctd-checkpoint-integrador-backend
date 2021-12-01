package com.projeto.ctd.service;

import java.util.List;

public interface IService<T> {

    List<T> getAll();

    T getById(Long id);

    List<T> getAllByType(String type);
}
