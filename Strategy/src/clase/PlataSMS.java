package clase;

public class PlataSMS implements ModalitatePlata{
    @Override
    public void plateste(float sunaDePlata) {
        System.out.println("S-a achitat prin SMS suma de " + sunaDePlata+" lei");
    }
}
