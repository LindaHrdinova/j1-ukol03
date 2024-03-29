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
        System.out.println("Program spuštěn.");

        Pocitac lindinPocitac = new Pocitac();
        System.out.println(lindinPocitac.toString());

        Procesor lindinProcesor = new Procesor();
        lindinProcesor.setRychlost(-7_200_000_000L);
        lindinProcesor.setRychlost(3_200_000_000L);
        lindinProcesor.setVyrobce("AMD");
        lindinPocitac.zapniSe();

        Pamet lindinaPamet = new Pamet();
        lindinaPamet.setKapacita(13_700_000_000L);

        Disk lindinDisk = new Disk();
        lindinDisk.setKapacita(954_000_000_000L);

        /*Disk lindinDisk2 = new Disk();
        lindinDisk2.setKapacita(954_000_000_000L);*/

        lindinPocitac.setCpu(lindinProcesor);
        lindinPocitac.setRam(lindinaPamet);
        lindinPocitac.setPevnyDisk(lindinDisk);

        System.out.println(lindinPocitac.toString());

        lindinPocitac.zapniSe();
        lindinPocitac.zapniSe();

        lindinPocitac.vymazSouboryOVelikosti(50);
        lindinPocitac.vytvorSouborOVelikosti(990);
        lindinPocitac.vymazSouboryOVelikosti(450);
        System.out.println(lindinPocitac.toString());
        lindinPocitac.vypniSe();
        lindinPocitac.vypniSe();
    }
}
