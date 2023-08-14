package com.example.repo;



import com.example.model.Declarant;

import java.util.List;

public interface DeclarantRepoI {
    List<Declarant> findAll();
    Declarant findById(String id);
    void update(Declarant declarant);
}
