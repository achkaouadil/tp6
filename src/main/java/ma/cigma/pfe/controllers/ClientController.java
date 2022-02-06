package ma.cigma.pfe.controllers;
import ma.cigma.pfe.services.ClientService;
import ma.cigma.pfe.models.Client;

import ma.cigma.pfe.services.ClientServiceImpl;
public class ClientController {

    ClientService clientService;
    public ClientController(ClientService clientService) {
        System.out.println("Call ClientController with clientService   param....");
        this.clientService = clientService;
    }



    public Client save(Client c ){
        System.out.println("ClientController level...");
        return clientService.save(c);
    }

    public ClientController() {
        System.out.println("Call ClientController ....");
    }

}
