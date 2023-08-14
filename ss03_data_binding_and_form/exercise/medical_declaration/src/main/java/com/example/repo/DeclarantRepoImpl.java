package com.example.repo;

import com.example.model.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DeclarantRepoImpl implements DeclarantRepoI {
    private static Map<String, Declarant> declarantMap;

    static {
        declarantMap = new HashMap<>();
        declarantMap.put("1", new Declarant("1",new Information("An", "2004", "Nu", "Viet Nam", "2001001838",
                new Travel("Khác","VN123","3"),
                new Dates("01", "02", "2022"), new Dates("02", "02", "2022"), "Da Nang"),
                new Contact("Gia Lai","Chuprong","Iaphin","Gia Lai,Chuprong,Iaphin","0829109712","antran0123@gmail.com"),
                new Disease(true,false,true,false,true,false,true,false),
                new HistoryInfection(true,false)));
    }

    @Override
    public List<Declarant> findAll() {
        return new ArrayList<>(declarantMap.values());
    }

    @Override
    public Declarant findById(String id) {
        return declarantMap.get(id);
    }

    @Override
    public void update(Declarant declarant) {
        if (declarantMap.containsKey(declarant.getIdDeclarant())) {
            declarantMap.put(declarant.getIdDeclarant(), declarant);
        }
    }
}
