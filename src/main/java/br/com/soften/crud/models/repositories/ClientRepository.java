package br.com.soften.crud.models.repositories;

import br.com.soften.crud.models.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

	List<Client> findByNameContaining(String name);

}
