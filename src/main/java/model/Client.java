package model;

/**
 * Clasa Client: este clasa in interiorul careia se retin propietatile clientului, prorietati ce se reflecta si in cadrul bazei de date.
 */

public class Client {
    private int id;
    private String nume;
    private String adresa;

    public Client(){
    }

    public Client(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    public Client(int id, String nume, String adresa) {
        this.id = id;
        this.nume = nume;
        this.adresa = adresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Client: " + id +
                ", nume: " + nume +
                ", adresa: " + adresa ;
    }
}
