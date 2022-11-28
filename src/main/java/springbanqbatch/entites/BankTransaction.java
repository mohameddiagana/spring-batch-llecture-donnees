package springbanqbatch.entites;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@EqualsAndHashCode
public class BankTransaction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  Long accountID;
    private Date transactiondate;
    @Transient
    private String strtransactiondate;
    private String strtransactionType;
    private double amount;
}
