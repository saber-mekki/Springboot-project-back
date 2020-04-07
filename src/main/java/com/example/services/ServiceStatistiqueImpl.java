package com.example.services;

import com.example.entities.Statistique;
import com.example.repositories.StatistiqueRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "StatistiqueService")
public class ServiceStatistiqueImpl implements ServiceStatistique{

    @Autowired
    private StatistiqueRepository repoStat;

    @Override
    public void ajouter(Statistique stat){
        repoStat.save(stat);
    }

}