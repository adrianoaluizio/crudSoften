package br.com.soften.crud.controller;

import br.com.soften.crud.models.entities.Client;
import br.com.soften.crud.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
	@Autowired
	private ClientService clientService;

	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable long id){
		Client client = clientService.findById(id);
		return ResponseEntity.ok(client);
	}

	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Client client){
		Client save = clientService.save(client);
		return ResponseEntity.ok(save);
	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<?> remove(@PathVariable long id){
		clientService.remove(id);
		return ResponseEntity.ok("");
	}

	@GetMapping("/findName/{name}")
	public ResponseEntity<?> findByName(@PathVariable String name){
		List<Client> client = clientService.findByName(name);
		return ResponseEntity.ok(client);
	}

	@GetMapping("/findall")
	public ResponseEntity<?> findall(){
		List<Client> client = clientService.findAll();
		return ResponseEntity.ok(client);
	}
}
