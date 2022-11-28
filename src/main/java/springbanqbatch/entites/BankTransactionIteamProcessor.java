package springbanqbatch.entites;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
public class BankTransactionIteamProcessor implements ItemProcessor<BankTransaction,BankTransaction> {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy-HH:mm");
    @Override
    public BankTransaction process(BankTransaction bankTransaction) throws Exception {
        bankTransaction.setTransactiondate(dateFormat.parse(bankTransaction.getStrtransactiondate()));
        return bankTransaction;
    }

}
