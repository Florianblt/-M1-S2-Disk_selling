package com.dev.selldisk.services;

import com.dev.selldisk.model.Client;

import java.util.List;

public interface IClientService {
    List<Client> getAllClients();
    Client getClientById(long idClient);
    boolean addClient(Client client);
    void updateClient(Client client);
    void deleteClient(int idClient);
}
