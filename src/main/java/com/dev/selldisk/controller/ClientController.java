package com.dev.selldisk.controller;

import com.dev.selldisk.model.Client;
import com.dev.selldisk.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Controller
@RequestMapping("client")
public class ClientController {

    @Autowired
    private IClientService clientService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("get/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable("id") Integer id){
        Client client = clientService.getClientById(id);
        return new ResponseEntity<Client>(client, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("get/{email}/{mdp}")
    public ResponseEntity<Client> connexionClient(@PathVariable("email") String email,@PathVariable("mdp") String mdp){
        Client client = clientService.connexionClient(email);
        if( mdp.equals(client.getPassword())) {
            return new ResponseEntity<Client>(client, HttpStatus.OK);
        } else {
            return new ResponseEntity<Client>(new Client(), HttpStatus.UNAUTHORIZED);
        }
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("getAll")
    public ResponseEntity<List<Client>> getAllClients(){
        List<Client> list = clientService.getAllClients();
        return new ResponseEntity<List<Client>>(list, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("add")
    public ResponseEntity<Void> addClient(@RequestBody Client client, UriComponentsBuilder builder) {
        boolean flag = clientService.addClient(client);
        if (flag == false) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/client/{id}").buildAndExpand(client.getIdClient()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("update")
    public ResponseEntity<Client> updateArticle(@RequestBody Client client) {
        clientService.updateClient(client);
        return new ResponseEntity<Client>(client, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable("id") Integer id) {
        clientService.deleteClient(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
