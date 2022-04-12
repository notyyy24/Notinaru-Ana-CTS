package main;

import composite.Autobuz;
import composite.Flota;
import composite.Nod;

public class Main {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz("BMW", "E445", 56);
        Autobuz a2 = new Autobuz("Otokar", "F-445", 66);
        Autobuz a3 = new Autobuz("Mercedes", "Edd445", 10);
        Autobuz a4 = new Autobuz("Reanult", "Eddd445", 8);
        Autobuz a5 = new Autobuz("Ope", "E45245245", 25);
        Autobuz a6 = new Autobuz("plm", "E44225", 30);

        Nod mari = new Flota("Autobuze Mari");
        Nod medii= new Flota("Autobuze Medii");
        Nod mici = new Flota("Autobuze Mici");
        Nod flota = new Flota("TOATA FLOTA");

        try {
            mici.adaugaNod(a3);

            mici.adaugaNod(a4);

            medii.adaugaNod(a5);
            medii.adaugaNod(a6);

            mari.adaugaNod(a1);
            mari.adaugaNod(a2);


            flota.adaugaNod(mici);
            flota.adaugaNod(medii);
            flota.adaugaNod((mari));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Garantie pt toata flota: " + flota.calculeazaSumaGarantie(2));
        System.out.println("Garantie pt mijlocie flota: " + medii.calculeazaSumaGarantie(2));

    }
}
