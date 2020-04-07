package com.example.controllers;

import com.example.entities.Statistique;
import com.example.services.ServiceStatistique;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/statistique")
public class StatistiqueController {


    @Autowired
    private ServiceStatistique serviceStatistique;

    @PostMapping("/save")
	public void save(@RequestBody Statistique stat){
        serviceStatistique.ajouter(stat);
    }
    


}