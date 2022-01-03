package xyz.hemoreg.demopostgresql.usermanagment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.hemoreg.demopostgresql.usermanagment.dto.ClientDTO;
import xyz.hemoreg.demopostgresql.usermanagment.model.Client;
import xyz.hemoreg.demopostgresql.usermanagment.repository.ClientRepository;

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

    public ClientDTO getClientById(Long id) {
        return clientRepository
                .getById(id)
                .toClientDTO();
    }
}
