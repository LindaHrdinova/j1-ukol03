package cz.czechitas.ukol3.model;

public class Disk {
    private Long kapacita;
    private Long vyuziteMisto = 0L;

    public Long getKapacita() {
        return kapacita;
    }

    public void setKapacita(Long kapacita) {
        if (kapacita < 0) {
            System.err.println("Kapacita disku nesmí být menší než 0");
        }
        this.kapacita = kapacita;
    }

    public Long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(Long vyuziteMisto) {
        if (vyuziteMisto < 0) {
            System.err.println("Kapacita disku nesmí být menší než 0");
        } else if (vyuziteMisto > kapacita) {
            System.err.println("Na disku není dostatek místa");
        }
        this.vyuziteMisto = vyuziteMisto;
    }

    public String toString() {
        return ("Kapacita disku: " + kapacita + " B\nObsazené místo: " + vyuziteMisto + " B.");
    }
}
