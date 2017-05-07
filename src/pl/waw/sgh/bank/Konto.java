package pl.waw.sgh.bank;

import java.math.BigDecimal;

/**
 * Created by prubac on 07.05.2017.
 */
public abstract class Konto {

    public Konto(Long kontoId, String waluta, Klient klient) {
        this.kontoId = kontoId;
        this.waluta = waluta;
        this.klient = klient;
        this.kwota = new BigDecimal(0);
    }

    private Long kontoId;

    private String waluta;

    private Klient klient;

    private BigDecimal kwota;

    public Long getKontoId() {
        return kontoId;
    }

    public void setKontoId(Long kontoId) {
        this.kontoId = kontoId;
    }

    public String getWaluta() {
        return waluta;
    }

    public void setWaluta(String waluta) {
        this.waluta = waluta;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public BigDecimal getKwota() {
        return kwota;
    }

    public void setKwota(BigDecimal kwota) {
        this.kwota = kwota;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "kontoId=" + kontoId +
                ", waluta='" + waluta + '\'' +
                ", klient=" + klient +
                ", kwota=" + kwota +
                '}';
    }
}
