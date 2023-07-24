package dz.abdelghani.bankmicroservice.web;

import dz.abdelghani.bankmicroservice.entities.Account;
import dz.abdelghani.bankmicroservice.repositories.AccountRepository;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.MediaType;
import java.util.List;
@RestController
@RequestMapping("/bank")
public class AccountRestController {
    AccountRepository accountRepository;

    public AccountRestController(AccountRepository accountRepository) {

        this.accountRepository = accountRepository;
    }

    @GetMapping(value = "/accounts",produces = {MediaType.APPLICATION_JSON})
    public List<Account> listAll(){

        return accountRepository.findAll();
    }

    @GetMapping(value = "/accounts/{id}",produces = {MediaType.APPLICATION_JSON})
    public Account findOne(@PathVariable Long id){

        return accountRepository.findById(id).get();
    }

    @PostMapping(value = "/accounts")
    public Account create(@RequestBody Account account){

        return accountRepository.save(account);
    }


    @PutMapping("/accounts/{id}")
    public Account update( @PathVariable Long id , @RequestBody Account account){
        account.setId(id);
        return accountRepository.save(account);
    }


    @DeleteMapping("/accounts/{id}")
    public void delete(@PathVariable Long id){
        accountRepository.deleteById(id);
    }
}
