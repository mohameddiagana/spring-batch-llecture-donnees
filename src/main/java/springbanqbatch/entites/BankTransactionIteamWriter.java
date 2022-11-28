package springbanqbatch.entites;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import springbanqbatch.Repository.BanqueTransactionRepository;

import java.util.List;

@Component
public class BankTransactionIteamWriter implements ItemWriter<BankTransaction> {
    @Autowired
    private BanqueTransactionRepository banqueTransactionRepository;


//    }
    @Override
    @StepScope@Scope(value = "step", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public void write(List<? extends BankTransaction> list) throws Exception {
        banqueTransactionRepository.saveAll(list);


    }
}
