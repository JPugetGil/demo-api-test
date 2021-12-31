package xyz.hemoreg.demomysql.usermanagment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.hemoreg.demomysql.usermanagment.dto.ProductDTO;
import xyz.hemoreg.demomysql.usermanagment.dto.ClientDTO;
import xyz.hemoreg.demomysql.usermanagment.model.Product;
import xyz.hemoreg.demomysql.usermanagment.model.Client;
import xyz.hemoreg.demomysql.usermanagment.repository.ProductRepository;
import xyz.hemoreg.demomysql.usermanagment.repository.ClientRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    @Transactional
    public List<ClientDTO> getClients() {
        return clientRepository
                .findAll()
                .stream()
                .map(Client::toClientDTO)
                .collect(Collectors.toList());
    }

    public ClientDTO getClientById(Integer id) {
        return clientRepository
                .getById(id)
                .toClientDTO();
    }
}
