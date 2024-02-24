package cz.czechitas.ukol3.model;

public class Pamet {
    private Long kapacita; // v bajtech

    public Long getKapacita() {
        return kapacita;
    }

    public void setKapacita(Long kapacita) {
        this.kapacita = kapacita;
    }

    public String toString() {
        return ("Kapacita paměti: " + kapacita + " B");
    }
}
