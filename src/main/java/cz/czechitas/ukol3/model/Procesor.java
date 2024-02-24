package cz.czechitas.ukol3.model;

public class Procesor {
    private String vyrobce;
    private Long rychlost;

    public String getVyrobce() {
        return vyrobce;
    }

    public void setVyrobce(String vyrobce) {
        this.vyrobce = vyrobce;
    }

    public Long getRychlost() {
        return rychlost;
    }

    public void setRychlost(Long rychlost) {
        if (rychlost < 0) {
            System.err.println("Rychlost procesoru nesmí být menší než 0");
        }
        this.rychlost = rychlost;
    }

    public String toString() {
        return ("Rychlost procesoru: " + rychlost + " hz\n" + "Výrobce procesoru: " + vyrobce + ".");
    }
}
