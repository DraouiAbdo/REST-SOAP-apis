package dz.abdelghani.bankmicroservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="mobile",types=Account.class)
public interface AccountProjection1 {
    double getBalance();
    AccountType getType();
}
