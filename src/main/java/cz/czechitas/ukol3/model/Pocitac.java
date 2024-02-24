package cz.czechitas.ukol3.model;

public class Pocitac {

    public Boolean jeZapnuty = false;
    public Procesor cpu;
    public Pamet ram;
    public Disk pevnyDisk;

    public String toString() {
        if(jeZapnuty)
        {return pevnyDisk.toString() + "\n" + ram.toString() + "\n" + cpu.toString();}
        return null;
    }

    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (jeZapnuty) {
            System.err.println("Počítač už je zapnutý.");
        } else if (ram == null || cpu == null || pevnyDisk == null) {
            System.err.println("Počítač nemá všechny součástky");
        }
        else {
            System.out.println("Počítač se zapnul.");
            jeZapnuty = true;
        }
    }

    public void vypniSe() {
        if (jeZapnuty) {
            System.out.println("Počítač se vypnul.");
            jeZapnuty = false;
        }
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }
}

