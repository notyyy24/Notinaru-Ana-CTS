package chainOfResponsibility.clase;

public class TroilebuzHandler extends Handler {
    public TroilebuzHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareRecomandare(int distanta) {
        if(distanta < limita) {
            System.out.println("Folositi troilebuzul");
        }
        else
        {
            super.nextHandler.afisareRecomandare(distanta);
        }
    }

}
