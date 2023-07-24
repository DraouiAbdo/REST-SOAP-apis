package dz.abdelghani.bankmicroservice.repositories;

import dz.abdelghani.bankmicroservice.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
