package main;

import clase.Autobuz;
import clase.AutobuzDeNoapte;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Nelu",30,5);
        autobuz.opresteInStatie();
        Autobuz autobuz1 = new Autobuz("Nelu",30,0);
        autobuz.opresteInStatie();

        AutobuzDeNoapte autobuzDeNoapte = new AutobuzDeNoapte(autobuz1);
        autobuzDeNoapte.opresteInStatie();
    }
}
