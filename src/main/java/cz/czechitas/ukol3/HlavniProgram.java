package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");

        Pocitac lindinPocitac = new Pocitac();
        System.out.println(lindinPocitac.toString());
             // Vypíše chybu, protože počítač v tuto chvíli nemá všechny povinné součásti.

        Procesor lindinProcesor = new Procesor();
        lindinProcesor.setRychlost(3_200_000_000L);
        lindinProcesor.setVyrobce("AMD");
        lindinPocitac.zapniSe();
        System.out.println("Procesor je od firmy " + lindinProcesor.vyrobce);

        Pamet lindinaPamet = new Pamet();
        lindinaPamet.setKapacita(13_700_000_000L);

        Disk lindinDisk = new Disk();
        lindinDisk.setKapacita(954_000_000_000L);

        lindinPocitac.setCpu(lindinProcesor);
        lindinPocitac.setRam(lindinaPamet);
        lindinPocitac.setPevnyDisk(lindinDisk);

        System.out.println(lindinPocitac.toString());

        lindinPocitac.zapniSe();
        lindinPocitac.zapniSe();      // Vypíše chybu, protože počítač už běží
        System.out.println(lindinPocitac.toString());
        lindinPocitac.vypniSe();

        lindinPocitac.vypniSe();      // Nevypíše chybu, ale nic neprovede, protože počítač už je vypnutý
    }

}
