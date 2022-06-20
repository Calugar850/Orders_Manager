package bll;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


import dao.ClientDAO;

import model.Client;

/**
 * Clasa ClientBLL: este clasa in interiorul careia se face apelul interogarilor SQL din tabelul corespunzator.
 */

public class ClientBLL {

    private ClientDAO clientDAO;

    public ClientBLL() {
        clientDAO = new ClientDAO();
    }

    public Client findClientById(int id) {
        Client client = clientDAO.findById(id);
        if (client == null) {
            throw new NoSuchElementException("The client with id =" + id + " was not found!");
        }
        return client;
    }

    public void deleteClientById(int id) { clientDAO.deleteById(id); }

    public List <Client> findAllClient() {
        List <Client> clients = clientDAO.findAll();
        if (clients == null) {
            throw new NoSuchElementException("Doesn't exist clients!");
        }
        return clients;
    }

    public void insertClient(Client client){ clientDAO.insert(client); }

    public void updateClientById(Client client,int id){ clientDAO.update(client,id); }
}