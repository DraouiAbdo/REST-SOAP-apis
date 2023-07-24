package dz.abdelghani.bankmicroservice;

import dz.abdelghani.bankmicroservice.entities.Account;
import dz.abdelghani.bankmicroservice.entities.AccountType;
import dz.abdelghani.bankmicroservice.repositories.AccountRepository;
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
    CommandLineRunner start(AccountRepository accountRepository){
        return args -> {
            accountRepository.save(new
                    Account(null,Math.random()*100,new Date(), AccountType.CURRENT));
            accountRepository.save(new
                    Account(null,Math.random()*100,new Date(), AccountType.SAVING));
            accountRepository.save(new
                    Account(null,Math.random()*100,new Date(), AccountType.CURRENT));
            accountRepository.findAll().forEach(c->{
                System.out.println(c.toString());
            });
        };
    }

}
