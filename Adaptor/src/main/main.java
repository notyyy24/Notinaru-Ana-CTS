package main;

import autobuz.AdaptorValidatorObiecte;
import autobuz.Autobuz;
import metrou.ValidatorMetrou;

public class main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz();
        ValidatorMetrou metrou = new ValidatorMetrou();

        AdaptorValidatorObiecte adaptorObiecte = new AdaptorValidatorObiecte(metrou);
        adaptorObiecte.validareBilet();
        adaptorObiecte.validareAbonament();
    }
}
