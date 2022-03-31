package main;
import factory.Factory;
import familie.MijlocTransport;
import familie.TipTransport;
import singleton.Singleton;


public class main {

    public static void main(String[] args) {
        Factory fabrica = new Factory();
        MijlocTransport a = fabrica.createObject(TipTransport.AUTOBUZ, "B100STB");
        MijlocTransport b = fabrica.createObject(TipTransport.TRAMVAI, "B101STB");
        MijlocTransport c = fabrica.createObject(TipTransport.TROLEIBUZ, "B102STB");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}


