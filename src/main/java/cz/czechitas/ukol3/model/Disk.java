package cz.czechitas.ukol3.model;

public class Disk {
    /*
    long kapacita – v bajtech
    long vyuziteMisto – v bajtech
     */
    public Long kapacita;
    public Long vyuziteMisto;

    public Long getKapacita() {
        return kapacita;
    }

    public void setKapacita(Long kapacita) {
        this.kapacita = kapacita;
    }

    public Long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(Long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }

    public String toString() {
        return ("Kapacita disku: " + kapacita + " B");
    }
}
