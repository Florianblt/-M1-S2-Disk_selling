package com.dev.selldisk.services.Impl;

import com.dev.selldisk.model.Client;
import com.dev.selldisk.repository.ClientRepository;
import com.dev.selldisk.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAllClients() {
        List<Client> list = new ArrayList<>();
        clientRepository.findAll().forEach(e -> list.add(e));
        return list;
    }

    @Override
    public Client getClientById(long idClient) {
        Client obj = clientRepository.findById(idClient).get();
        return obj;
    }

    @Override
    public Client connexionClient(String email) {
        Client obj = clientRepository.findByMail(email).get(0);
        return obj;
    }

    @Override
    public boolean addClient(Client client) {
        List<Client> list = clientRepository.findByMail(client.getMail());
        if(list.size() > 0)
            return false;
        else
            clientRepository.save(client);
        return true;
    }

    @Override
    public void updateClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public void deleteClient(int idClient) {
        clientRepository.delete(getClientById(idClient));
    }
}
