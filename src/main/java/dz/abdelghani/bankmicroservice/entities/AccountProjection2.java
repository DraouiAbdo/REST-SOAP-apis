package dz.abdelghani.bankmicroservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="balance",types=Account.class)
public interface AccountProjection2 {
    double getBalance();
}
