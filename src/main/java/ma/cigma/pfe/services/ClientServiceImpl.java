// La classe d’implémentation de l’interface Client Service

package ma.cigma.pfe.services;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.repositories.ClientRepository;
import ma.cigma.pfe.repositories.ClientRepositoryImpl;

public class ClientServiceImpl implements ClientService{
    ClientRepository clientRepository ;
    public ClientServiceImpl(ClientRepository clientRepository) {
        System.out.println("Call ClientServiceImpl with ClientRepository   param....");
        this.clientRepository = clientRepository;
    }


    @Override
    public Client save(Client c) {
        System.out.println("Service Layer : ClientServiceImpl Level... ");
        return clientRepository.save(c);
    }

    public ClientServiceImpl() {
        System.out.println("CallClientServiceImpl ....");
    }



    }
