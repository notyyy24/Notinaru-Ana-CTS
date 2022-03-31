package factoryMethod;

public class MainFactory {
    public static void main(String[] args) {
        MijlocTransport autobuz=new AutobuzFactory().createObject("B333STB");
        System.out.println(autobuz.toString());

        MijlocTransport troilebuz=new TroleibuzFactory().createObject("B444STB");
        System.out.println(troilebuz.toString());

        MijlocTransport tramvai=new TramvaiFactory().createObject("B555STB");
        System.out.println(tramvai.toString());
    }
}
