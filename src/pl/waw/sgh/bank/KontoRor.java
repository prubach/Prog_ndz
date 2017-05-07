package pl.waw.sgh.bank;

/**
 * Created by prubac on 07.05.2017.
 */
public class KontoRor extends Konto {
    public KontoRor(Long kontoId, Klient klient) {
        super(kontoId, "PLN", klient);
    }
}
