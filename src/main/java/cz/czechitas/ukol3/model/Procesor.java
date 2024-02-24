package cz.czechitas.ukol3.model;

public class Procesor {
    private String vyrobce;
    private Long rychlost; // v hz

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
        this.rychlost = rychlost;
    }

    public String toString() {
        return ("Rychlost procesoru: " + rychlost + " hz\n" + "Výrobce procesoru: " + vyrobce + ".");
    }
}
