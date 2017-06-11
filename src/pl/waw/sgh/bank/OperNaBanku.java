package pl.waw.sgh.bank;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import pl.waw.sgh.bank.exception.BrakSrodkowException;

import java.math.BigDecimal;

/**
 * Created by prubac on 07.05.2017.
 */
public class OperNaBanku {
    public static void main(String[] args) {
            //throws BrakSrodkowException {
        Bank bank = new Bank();
        Klient kl1 = bank.stworzKlienta("Anna", "Kowalska");
        Klient kl2 = bank.stworzKlienta("Jan", "Malinowski");

        Konto k1 = bank.otworzKonto(Bank.KONTO_ROR, kl1);

        Konto k2 = bank.otworzKonto(Bank.KONTO_USD, kl1);

        Konto k3 = bank.otworzKonto(Bank.KONTO_ROR, kl2);

        Konto k4 = bank.otworzKonto(Bank.KONTO_OSZCZ, kl2);

        System.out.println(bank);

        k1.uznanie(new BigDecimal(100));
        k2.uznanie(new BigDecimal(200));
        try {
            bank.przelew(30L, 1L, new BigDecimal(100));
            System.out.println(bank);
        } catch (BrakSrodkowException be) {
            System.out.println(be.getMessage());
        }

    }
}
