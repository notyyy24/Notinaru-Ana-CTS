package chainOfResponsibility.clase;

public class MetrouHandler extends Handler{
    public MetrouHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareRecomandare(int distanta) {
        if(distanta < limita) {
            System.out.println("Folositi metroul");
        }
        else
        {
            super.nextHandler.afisareRecomandare(distanta);
        }

    }
}
