package pl.waw.sgh.bank;

/**
 * Created by prubac on 07.05.2017.
 */
public class OperNaBanku {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Klient kl1 = bank.stworzKlienta("Anna", "Kowalska");
        Klient kl2 = bank.stworzKlienta("Jan", "Malinowski");

        Konto k1 = bank.otworzKonto(Bank.KONTO_ROR, kl1);

        Konto k2 = bank.otworzKonto(Bank.KONTO_USD, kl1);

        Konto k3 = bank.otworzKonto(Bank.KONTO_ROR, kl2);

        Konto k4 = bank.otworzKonto(Bank.KONTO_OSZCZ, kl2);

        System.out.println(bank);



    }
}
