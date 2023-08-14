package com.example.service;

import com.example.model.Declarant;

import java.util.List;

public interface DeclarantServiceI {
    List<Declarant> findAll();
    Declarant findById(String id);
    void update(Declarant declarant);
}
