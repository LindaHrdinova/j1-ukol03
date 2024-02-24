package cz.czechitas.ukol3.model;

public class Pamet {
    private Long kapacita;

    public Long getKapacita() {
        return kapacita;
    }

    public void setKapacita(Long kapacita) {
        if (kapacita < 0) {
            System.err.println("Kapacita paměti nesmí být menší než 0");
        }
        this.kapacita = kapacita;
    }

    public String toString() {
        return ("Kapacita paměti: " + kapacita + " B");
    }
}
