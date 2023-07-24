package dz.abdelghani.bankmicroservice;

import dz.abdelghani.bankmicroservice.entities.Account;
import dz.abdelghani.bankmicroservice.entities.AccountType;
import dz.abdelghani.bankmicroservice.entities.Client;
import dz.abdelghani.bankmicroservice.repositories.AccountRepository;
import dz.abdelghani.bankmicroservice.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class BankMicroserviceApplication {

    public static void main(String[] args) {

        SpringApplication.run(BankMicroserviceApplication.class, args);
    }
@Bean
    CommandLineRunner start(AccountRepository accountRepository
                            ,ClientRepository clientRepository){
        return args -> {
            Client c1 = clientRepository.save(new Client(null,"Ahmed",null));
            Client c2 = clientRepository.save(new Client(null,"Amine",null));
            accountRepository.save(new
                    Account(null,Math.random()*100,new Date(), AccountType.CURRENT,c1));
            accountRepository.save(new
                    Account(null,Math.random()*100,new Date(), AccountType.SAVING,c2));
            accountRepository.save(new
                    Account(null,Math.random()*100,new Date(), AccountType.CURRENT,c2));
            accountRepository.findAll().forEach(c->{
                System.out.println(c.getBalance());
            });
        };
    }

}
