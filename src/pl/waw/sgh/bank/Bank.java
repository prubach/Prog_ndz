package pl.waw.sgh.bank;

import pl.waw.sgh.bank.exception.BrakKontaException;
import pl.waw.sgh.bank.exception.BrakSrodkowException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by prubac on 07.05.2017.
 */
public class Bank {

    public static final int KONTO_ROR = 0;
    public static final int KONTO_OSZCZ = 1;
    public static final int KONTO_USD = 2;

    private List<Klient> klientList = new ArrayList<>();

    private List<Konto> kontoList = new ArrayList<>();

    private Long ostKlientId = 1L;

    private Long ostKontoId = 1L;

    public void przelew(Long nrKontaZrod, Long nrKontaCel,
                        BigDecimal kwota)
            throws BrakSrodkowException, BrakKontaException {
        Konto kontoZrod = znajdzKonto(nrKontaZrod);
        Konto kontoCel = znajdzKonto(nrKontaCel);
        kontoZrod.obciazenie(kwota);
        kontoCel.uznanie(kwota);
    }

    private Konto znajdzKonto(Long nrKonta)
            throws BrakKontaException {
        for (Konto k : kontoList) {
            if (nrKonta.equals(k.getKontoId()))
                return k;
        }
        throw new BrakKontaException("Brak konta o nr: " + nrKonta);
    }


    public Klient stworzKlienta(String imie, String nazwisko) {
        Klient nowyKlient = new Klient(ostKlientId, imie, nazwisko);
        klientList.add(nowyKlient);
        ostKlientId++;
        return nowyKlient;
    }

    public Konto otworzKonto(int typ, Klient klient) {
        Konto noweKonto = null;
        switch (typ) {
            case KONTO_ROR:
                noweKonto = new KontoRor(ostKontoId, klient);
                break;
            case KONTO_USD:
                noweKonto = new KontoUSD(ostKontoId, klient);
                break;
            case KONTO_OSZCZ:
                noweKonto = new KontoOszcz(ostKlientId, klient);
        }
        ostKontoId++;
        kontoList.add(noweKonto);
        return noweKonto;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "klienci=" + klientList +
                "\nkonta=" + kontoList +
                "\nostKlientId=" + ostKlientId +
                ", ostKontoId=" + ostKontoId +
                '}';
    }
}
