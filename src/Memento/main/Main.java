package Memento.main;
//13.  Pentru fiecare Autobuz se solicita salvarea acestora in memorie pentru posibilitatea de a reveni la o forma anterioara
// a obiectului respectiv. Se doreste implementarea unui modul care sa asigure aceasta salvare cu consum optim de memorie in
// conditiile in care este cunoscut faptul ca atributele care se vor modifica cu o frecventa mai mare sunt cele legate de soferul
// care il conduce, consumul mediu, etc. Celelalte atribute precum model, an fabricatie, numar locuri nu se vor modifca frecvent.

import Memento.clase.Autobuz;
import Memento.clase.Manager;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("ion",10.4,40,"VW",2010);
        System.out.println(autobuz.toString());

        Manager manager = new Manager();
        manager.addMemento(autobuz.creeazaMemento());

        autobuz.setNumeSofer("Nelu");
        autobuz.setConsumMediu(9.5);

        manager.addMemento(autobuz.creeazaMemento());

        System.out.println(autobuz.toString());
        autobuz.setNumeSofer("Popescu");
        System.out.println(autobuz.toString());
        autobuz.restaurareMemento(manager.getMemento(0));
        System.out.println(autobuz.toString());
    }
}
