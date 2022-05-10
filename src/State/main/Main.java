package State.main;

import State.clase.Autobuz;
import State.clase.LaReparat;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz(120);
        autobuz1.pleacaInCursa();
        autobuz1.ieseDinService();
        autobuz1.ajungeLaCapatDeLinie();
        autobuz1.intraInService();
        autobuz1.ajungeLaCapatDeLinie();
        autobuz1.ieseDinService();
    }
}
