package model;

/**
 * Clasa Product: este clasa in interiorul careia se retin propietatile produsului, prorietati ce se reflecta si in cadrul bazei de date.
 */

public class Product {
    private int id;
    private String nume;
    private int cantitate;
    private int pret;

    public Product(){
    }

    public Product(String nume, int cantitate, int pret) {
        this.nume = nume;
        this.cantitate = cantitate;
        this.pret = pret;
    }

    public Product(int id, String nume, int cantitate, int pret) {
        this.id = id;
        this.nume = nume;
        this.cantitate = cantitate;
        this.pret = pret;
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

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Product: " + id +
                ", nume: " + nume  +
                ", cantitate: " + cantitate +
                ", pret: " + pret;
    }
}
