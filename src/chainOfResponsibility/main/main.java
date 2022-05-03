package chainOfResponsibility.main;

import chainOfResponsibility.clase.*;
import chainOfResponsibility.clase.*;
//12. Trebuie implementat un modul care sa ii spuna calatorului ce mijloc de transport trebuie sa foloseasca in
// functie de distanta pe care o are de parcurs. Astfel, daca un calator are de parcurs o distanta mai mica de 3 km,
// este recomandat sa mearga cu Troleibuzul. Daca are o distanta cuprinsa intre 3 si 5 km i se recomanda sa foloseasca autobuzul,
// iar daca are o distanta mai mare de 5 km, dar mai mica decat 10,  i se recomanda sa foloseasca Tramvaiul. In cazul in care
// distanta este mai mare decat 10 km i se recomanda sa foloseasca Metroul.
//
//Sa se implementeze acest modul in cadrul aplicatiei.
public class main {
    public static void main(String[] args) {
        Handler troilebuz = new TroilebuzHandler(3);
        Handler autobuz = new AutobuzHandler(5);
        Handler tramvai = new TramvaiHandler(10);
        Handler metrou = new MetrouHandler(1000);

        troilebuz.setNextHandler(autobuz);
        autobuz.setNextHandler(tramvai);
        tramvai.setNextHandler(metrou);

        troilebuz.afisareRecomandare(8);
        troilebuz.afisareRecomandare(11);
        troilebuz.afisareRecomandare(100);

        System.out.println("PENTRU CLUJ");
        Handler metrouCJ = new MetrouHandler(2);
        Handler troleibuzCJ = new TroilebuzHandler(5);
        Handler autobuzCJ = new AutobuzHandler(1000);
        Handler tramvaiCJ = new TramvaiHandler(3);

        metrouCJ.setNextHandler(tramvaiCJ);
        tramvaiCJ.setNextHandler(troleibuzCJ);
        troleibuzCJ.setNextHandler(autobuzCJ);

        metrouCJ.afisareRecomandare(3);
        metrouCJ.afisareRecomandare(6);
    }

}
