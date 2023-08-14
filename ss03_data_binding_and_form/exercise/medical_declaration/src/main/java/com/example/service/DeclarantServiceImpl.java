package com.example.service;

import com.example.model.Declarant;
import com.example.repo.DeclarantRepoI;
import com.example.repo.DeclarantRepoImpl;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeclarantServiceImpl implements DeclarantServiceI{
    DeclarantRepoI repoI = new DeclarantRepoImpl();
    @Override
    public List<Declarant> findAll() {
        return repoI.findAll();
    }

    @Override
    public Declarant findById(String id) {
        return repoI.findById(id);
    }

    @Override
    public void update(Declarant declarant) {
        repoI.update(declarant);
    }
}
