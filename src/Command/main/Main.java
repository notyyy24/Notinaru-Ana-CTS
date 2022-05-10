package Command.main;

import Command.clase.Autobuz;
import Command.clase.ComandaPlecareTraseu;
import Command.clase.Operator;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        Autobuz autobuz1 = new Autobuz("WV");
        Autobuz autobuz2 = new Autobuz("bmw");

        ComandaPlecareTraseu comandaPlecareTraseu = new ComandaPlecareTraseu(autobuz1,1);
        operator.invoca(comandaPlecareTraseu);

        operator.invoca(new ComandaPlecareTraseu(autobuz2,3));
        operator.invoca(new ComandaPlecareTraseu(autobuz1,4));
        operator.invoca(new ComandaPlecareTraseu(autobuz1,5));
        operator.invoca(new ComandaPlecareTraseu(autobuz2,2));
        operator.invoca(new ComandaPlecareTraseu(autobuz2,1));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
