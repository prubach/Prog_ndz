package pl.waw.sgh.bank;

/**
 * Created by prubac on 07.05.2017.
 */
public class KontoOszcz extends Konto {
    public KontoOszcz(Long kontoId, Klient klient) {
        super(kontoId, "PLN", klient);
    }
}
