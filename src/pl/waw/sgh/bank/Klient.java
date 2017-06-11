package pl.waw.sgh.bank;

/**
 * Created by prubac on 07.05.2017.
 */
public class Klient {

    private Long klientId;

    private String imie;

    private String nazwisko;

    public Klient(Long klientId, String imie, String nazwisko) {
        this.klientId = klientId;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Long getKlientId() {
        return klientId;
    }

    public void setKlientId(Long klientId) {
        this.klientId = klientId;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "KlientUI{" +
                "klientId=" + klientId +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
