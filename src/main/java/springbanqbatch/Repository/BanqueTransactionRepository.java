package springbanqbatch.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbanqbatch.entites.BankTransaction;

public interface BanqueTransactionRepository extends JpaRepository<BankTransaction,Long> {
}
