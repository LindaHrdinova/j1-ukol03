package cz.czechitas.ukol3.model;

;

public class Pocitac {

    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;
    private Disk pevnyDisk2;

    public String toString() {
        return (pevnyDisk + "\n" + ram + "\n" + cpu);
    }
    /* toString nedodělaný bonus
    public String toString() {
        if (pevnyDisk2 == null && pevnyDisk != null) {
            return (pevnyDisk + "\n" + ram + "\n" + cpu);
        } else {
            return (pevnyDisk + "\n" + pevnyDisk2 + "\n" + ram + "\n" + cpu);
        }
    }*/

    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (jeZapnuty()) {
            System.err.println("Počítač už je zapnutý.");
        } else if (ram == null || cpu == null || pevnyDisk == null) {
            System.err.println("Počítač nemá všechny součástky");
        } else {
            jeZapnuty = true;
            System.out.println("Počítač se zapnul.");
        }
    }

    public void vypniSe() {
        if (jeZapnuty()) {
            jeZapnuty = false;
            System.out.println("Počítač se vypnul.");
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

    public Disk getPevnyDisk2() {
        return pevnyDisk2;
    }

    public void setPevnyDisk2(Disk pevnyDisk2) {
        this.pevnyDisk2 = pevnyDisk2;
    }

    public void vytvorSouborOVelikosti(long velikost) {
        if (!jeZapnuty()) {
            return;
        }
        long vyuziteMisto = pevnyDisk.getVyuziteMisto();
        if (pevnyDisk.getVyuziteMisto() + velikost <= pevnyDisk.getKapacita()) {
            pevnyDisk.setVyuziteMisto(vyuziteMisto + velikost);
            System.out.println("Soubor vytvořen.");
        } else {
            System.err.println("Na disku není dostatek místa.");
        }
    }

    public void vymazSouboryOVelikosti(long velikost) {
        if (!jeZapnuty()) {
            return;
        }
        long vyuziteMisto = pevnyDisk.getVyuziteMisto();
        if (vyuziteMisto - velikost >= 0) {
            pevnyDisk.setVyuziteMisto(vyuziteMisto - velikost);
            System.out.println("Soubor smazán.");
        } else {
            System.err.println("Disk nemá takové množství obsazeného místa.");
        }
    }

    /*nedodělaný bonus k domácímu úkolu
    public void vytvorSouborOVelikosti(long velikost) {
        if (!jeZapnuty()) {
            return;
        }
        if (pevnyDisk2 != null) {
            long celkoveVyuziteMisto = pevnyDisk.getVyuziteMisto() + pevnyDisk2.getVyuziteMisto();
            long celkovaKapacita = pevnyDisk.getKapacita() + pevnyDisk2.getKapacita();
            if (celkoveVyuziteMisto + velikost <= celkovaKapacita) {
                if (velikost + pevnyDisk.getVyuziteMisto() <= pevnyDisk.getKapacita()) {
                    pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() + velikost);
                } else {
                    pevnyDisk2.setVyuziteMisto(velikost - (pevnyDisk.getKapacita() - pevnyDisk.getVyuziteMisto()));
                    pevnyDisk.setKapacita(pevnyDisk.getKapacita());
                }
                System.out.println("Soubor vytvořen.");
            } else {
                System.err.println("Na discích není dostatek místa.");
            }
        } else {
            long vyuziteMisto = pevnyDisk.getVyuziteMisto();
            if (pevnyDisk.getVyuziteMisto() + velikost <= pevnyDisk.getKapacita()) {
                pevnyDisk.setVyuziteMisto(vyuziteMisto + velikost);
                System.out.println("Soubor vytvořen.");
            } else {
                System.err.println("Na disku není dostatek místa.");
            }
        }
    }*/

    /* nedodělaný bonus k domácímu úkolu
    public void vymazSouboryOVelikosti(long velikost) {
        if (!jeZapnuty()) {
            return;
        }

        if (pevnyDisk2 != null) {
            long celkoveVyuziteMisto = pevnyDisk.getVyuziteMisto() + pevnyDisk2.getVyuziteMisto();
            if (celkoveVyuziteMisto - velikost >= 0) {
                if (pevnyDisk2.getVyuziteMisto() - velikost >= pevnyDisk2.getKapacita()) {
                    pevnyDisk.setVyuziteMisto(velikost - pevnyDisk2.getVyuziteMisto());
                    pevnyDisk2.setVyuziteMisto(0L);
                } else {
                    System.err.println("Disky nemá takové množství obsazeného místa.");
                }
            } else {
                long vyuziteMisto = pevnyDisk.getVyuziteMisto();
                if (pevnyDisk.getVyuziteMisto() - velikost >= 0) {
                    pevnyDisk.setVyuziteMisto(vyuziteMisto - velikost);
                    System.out.println("Soubor smazán.");
                } else {
                    System.err.println("Disk nemá takové množství obsazeného místa.");
                }
            }
        }
    }*/
}

