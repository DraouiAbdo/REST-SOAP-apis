package dz.abdelghani.bankmicroservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Account {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private Double balance;
@Temporal(TemporalType.DATE)
    private Date creationDate;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    @ManyToOne
    private Client client;

}
