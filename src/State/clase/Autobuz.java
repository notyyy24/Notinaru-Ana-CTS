package State.clase;

public class Autobuz {
    private Stare stare;
    private int nrAutobuz;

    public Autobuz( int nrAutobuz) {
        this.stare = new LaCapatDeLinie();
        this.nrAutobuz = nrAutobuz;
    }

    public Stare getStare() {
        return stare;
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public void pleacaInCursa() {
        InCursa inCursa = new InCursa();
        inCursa.actualizareStare(this);
    }

    public void intraInService() {
        new LaReparat().actualizareStare(this);
    }

    public void ieseDinService() {
        new LaCapatDeLinie().actualizareStare(this);
    }

    public void ajungeLaCapatDeLinie() {
        new LaCapatDeLinie().actualizareStare(this);
    }
}
