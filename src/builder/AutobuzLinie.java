package builder;

public class AutobuzLinie {
    private int nrLinie;
    private String numeSofer;
    private boolean deschideUsile;
    private boolean areOprire;
    private String textRulat;
    private String model;
    private int nrCalatori;

    public AutobuzLinie() {
        this.nrLinie = 1;
        this.numeSofer = "Andrei";
        this.deschideUsile = true;
        this.areOprire = true;
        this.textRulat = "Buna ";
        this.model = "Mercedes";
        this.nrCalatori = 50;
    }

    public void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
    }

    public void setAreOprire(boolean areOprire) {
        this.areOprire = areOprire;
    }

    public void setTextRulat(String textRulat) {
        this.textRulat = textRulat;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNrCalatori(int nrCalatori) {
        this.nrCalatori = nrCalatori;
    }

    @Override
    public String toString() {
        return "AutobuzLinie{" +
                "nrLinie=" + nrLinie +
                ", numeSofer='" + numeSofer + '\'' +
                ", deschideUsile=" + deschideUsile +
                ", areOprire=" + areOprire +
                ", textRulat='" + textRulat + '\'' +
                ", model='" + model + '\'' +
                ", nrCalatori=" + nrCalatori +
                '}';
    }
}
