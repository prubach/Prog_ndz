package pl.waw.sgh.bank;

/**
 * Created by prubac on 07.05.2017.
 */
public class KontoUSD extends Konto {

    public KontoUSD(Long kontoId, Klient klient) {
        super(kontoId, "USD", klient);
    }
}
