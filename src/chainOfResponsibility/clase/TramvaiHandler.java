package chainOfResponsibility.clase;

public class TramvaiHandler extends Handler{
    public TramvaiHandler(int limita) {
        super(limita);
    }
    @Override
    public void afisareRecomandare(int distanta) {
        if(distanta < limita) {
            System.out.println("Folositi tramvaiul");
        }
        else
        {
            super.nextHandler.afisareRecomandare(distanta);
        }
    }
}
