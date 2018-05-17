package com.dev.selldisk.controller;


import com.dev.selldisk.model.Liste;
import com.dev.selldisk.services.IListeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Controller
@RequestMapping("liste")
public class ListeController {


    @Autowired
    private IListeService listeService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("get/{id}")
    public ResponseEntity<Liste> getListeById(@PathVariable("id") Integer id) {
        Liste liste = listeService.getListeById(id);
        return new ResponseEntity<Liste>(liste, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("getAll")
    public ResponseEntity<List<Liste>> getAllListes() {
        List<Liste> list = listeService.getAllListes();
        return new ResponseEntity<List<Liste>>(list, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("panier/{id}")
    public ResponseEntity<Liste> getPanier(@PathVariable("id") Integer id) {
        Liste liste = listeService.getPanier(id);
        return new ResponseEntity<Liste>(liste, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("add")
    public ResponseEntity<Void> addListe(@RequestBody Liste liste, UriComponentsBuilder builder) {
        boolean flag = listeService.addListe(liste);
        if (flag == false) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/liste/{id}").buildAndExpand(liste.getIdListe()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("update")
    public ResponseEntity<Liste> updateListe(@RequestBody Liste liste) {
        listeService.updateListe(liste);
        return new ResponseEntity<Liste>(liste, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteListe(@PathVariable("id") Integer id) {
        listeService.deleteListe(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
