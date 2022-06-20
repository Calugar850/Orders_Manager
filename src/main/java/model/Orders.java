package model;

/**
 * Clasa Orders: este clasa in interiorul careia se retin propietatile comenzilor, prorietati ce se reflecta si in cadrul bazei de date.
 */
public class Orders {
    private int id;
    private int idClient;
    private int idProdus;
    private int cantitate;
    private int suma;

    public Orders(){
    }

    public Orders(int idClient, int idProdus, int cantitate, int suma) {
        this.idClient = idClient;
        this.idProdus = idProdus;
        this.cantitate = cantitate;
        this.suma = suma;
    }

    public Orders(int id, int idClient, int idProdus, int cantitate, int suma) {
        this.id = id;
        this.idClient = idClient;
        this.idProdus = idProdus;
        this.cantitate = cantitate;
        this.suma = suma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdProdus() {
        return idProdus;
    }

    public void setIdProdus(int idProdus) {
        this.idProdus = idProdus;
    }

    public int getCantitate() { return cantitate; }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    @Override
    public String toString() {
        return "Orders: " + id +", idClient: " + idClient +
                ", idProdus: " + idProdus +
                ", cantitate: " + cantitate +
                ", suma: " + suma;
    }
}
