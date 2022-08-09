package br.com.soften.crud.services;

import br.com.soften.crud.models.entities.Client;
import br.com.soften.crud.models.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
	@Autowired
	private ClientRepository clientRepository;

	public Client save(Client client){
		return clientRepository.save(client);
	}

	public void remove(long id){
		clientRepository.deleteById(id);
	}

	public Client findById(long id){
		return clientRepository.findById(id).orElse(new Client());
	}

	public List<Client> findAll(){
		return clientRepository.findAll();
	}

	public List<Client> findByName(String name){
		return clientRepository.findByNameContaining(name);
	}
}
