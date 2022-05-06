package flyWeight.main;

import flyWeight.clase.Autobuz;
import flyWeight.clase.FabricaLinie;
import flyWeight.clase.Linie;

/*
9.  Pentru fiecare AutobuzLinie sunt salvate in memorie, informatii precum: model autobuz, an fabricatie, numar locuri, numar linie,prima statie,
 ultima statie. Aceste informatii sunt salvate pentru fiecare AutobuzLinie din oras. Se doreste implementarea unui modul care sa asigure gestiunea
  in mod optim a memoriei, tinandu-se cont de faptul ca anumite informatii sunt redundante, deoarece pe o linie vor merge mai multe autobuze.
 */
public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("Mercedes",2009,45);
        Autobuz autobuz2 = new Autobuz("BMW",2010,40);
        Autobuz autobuz3 = new Autobuz("Audi",2005,42);
        Autobuz autobuz4 = new Autobuz("WV",2017,35);

        FabricaLinie fabricaLinie = new FabricaLinie();
        fabricaLinie.getLinie(133).afiseazaDetaliiAutobuzLinie(autobuz1);
        fabricaLinie.getLinie(133).afiseazaDetaliiAutobuzLinie(autobuz2);
        fabricaLinie.getLinie(140).afiseazaDetaliiAutobuzLinie(autobuz4);
        fabricaLinie.getLinie(140).afiseazaDetaliiAutobuzLinie(autobuz3);

    }
}
