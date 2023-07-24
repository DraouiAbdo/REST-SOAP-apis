package dz.abdelghani.bankmicroservice.repositories;

import dz.abdelghani.bankmicroservice.entities.Account;
import dz.abdelghani.bankmicroservice.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client,Long> {

}
