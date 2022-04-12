package main;

import clase.PlataCardBancar;
import clase.PlataCardSTB;
import clase.PlataSMS;
import clase.Validator;

public class Main {
    public static void main(String[] args) {
        PlataCardSTB plataCardSTB = new PlataCardSTB();
        PlataCardBancar plataCardBancar = new PlataCardBancar();
        PlataSMS plataSMS = new PlataSMS();

        Validator validator = new Validator(plataCardSTB,2);
        validator.platesteCalatorie();
        validator.setModalitatePlata(plataCardBancar);
        validator.platesteCalatorie();
    }
}
