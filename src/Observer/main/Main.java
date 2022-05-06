package Observer.main;

import Observer.clase.Autobuz;
import Observer.clase.Calator;
import Observer.clase.Observer;
import Observer.clase.Subiect;

/*
11. Se doreste implementarea unei aplicatii prin care utilizatorii se pot inregistra intr-o lista de calatori care sa fie anuntati atunci cand
 autobuzul pleaca de la capat de linie. Autobuzul cand pleaca in cursa de la capatul de linie trebuie sa anunte toti acesti calatori că s-a pus
  in miscare. Calatorii vor putea in acest mod sa stie cand trebuie sa astepte autobuzul in statie.
 */
public class Main {
    public static void main(String[] args) {
        Subiect autobuz = new Autobuz(32);

        Observer calator1 = new Calator("Alex");
        Observer calator2 = new Calator("Mihai");
        Observer calator3 = new Calator("Ana");

        autobuz.adaugaCalator(calator1);
        autobuz.adaugaCalator(calator2);
        autobuz.notificareCalatori();

        autobuz.adaugaCalator(calator3);
        autobuz.stergeGalator(calator1);
        autobuz.notificareCalatori();
    }
}
