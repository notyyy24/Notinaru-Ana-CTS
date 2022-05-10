package State.clase;

public class LaReparat implements Stare{
    @Override
    public void actualizareStare(Autobuz autobuz) {
        if(autobuz.getStare() instanceof LaCapatDeLinie) {
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " este la reperat.");
            autobuz.setStare(this);
        }
        else
        {
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " nu poate intra in service.");
        }
    }
}
