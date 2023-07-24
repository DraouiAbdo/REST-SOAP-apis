package dz.abdelghani.bankmicroservice.web;

import dz.abdelghani.bankmicroservice.entities.Account;
import dz.abdelghani.bankmicroservice.repositories.AccountRepository;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;
@Component
@WebService(serviceName = "BankWS")
public class AccountSOAPService {
    AccountRepository accountRepository;


    public AccountSOAPService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    @WebMethod
    public List<Account> allAccounts(){
        return accountRepository.findAll();
    }

    @WebMethod
    public Account getOne(@WebParam(name="id") Long id){
        return accountRepository.findById(id).get();
    }
}
