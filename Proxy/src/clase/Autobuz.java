package clase;

public class Autobuz implements MijlocTransport{
    private String numeSofer;
    private int nrLocuri;
    private int nrCalatori;

    public Autobuz(String numeSofer, int nrLocuri, int nrCalatori) {
        this.numeSofer = numeSofer;
        this.nrLocuri = nrLocuri;
        this.nrCalatori = nrCalatori;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul a oprit in statie cu " +this.nrCalatori+ " calatori");
    }
}
