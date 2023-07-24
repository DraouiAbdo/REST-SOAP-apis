package dz.abdelghani.bankmicroservice.web;

import dz.abdelghani.bankmicroservice.entities.Account;
import dz.abdelghani.bankmicroservice.repositories.AccountRepository;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
@Component
@Path("/bank")
public class JaxRSAPI {
    AccountRepository accountRepository;

    public JaxRSAPI(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Path("/accounts")
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Account> listAll(){
        return accountRepository.findAll();
    }

    @Path("/accounts/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Account findOne(@PathParam("id") Long id){
        return accountRepository.findById(id).get();
    }

    @Path("/accounts")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Account create(Account account){
        return accountRepository.save(account);
    }


    @Path("/accounts/{id}")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Account update(@PathParam("id") Long id , Account account){
        account.setId(id);
        return accountRepository.save(account);
    }

    @Path("/accounts/{id}")
    @DELETE

    public void delete(@PathParam("id") Long id){
        accountRepository.deleteById(id);
    }
}
