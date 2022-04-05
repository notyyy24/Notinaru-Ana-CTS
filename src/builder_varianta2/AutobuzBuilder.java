package builder_varianta2;

import builder_varianta2.Builder;

public class AutobuzBuilder implements Builder {
    private int nrLinie;
    private String numeSofer;
    private boolean deschideUsile;
    private boolean areOprire;
    private String textRulat;
    private String model;
    private int nrCalatori;


    public AutobuzBuilder() {
        this.nrLinie = 11;
        this.numeSofer = "Ana";
        this.deschideUsile = true;
        this.areOprire = false;
        this.textRulat = "neata";
        this.model = "ww";
        this.nrCalatori = 24;
    }

    public AutobuzLinie build() {
        return new AutobuzLinie(this.nrLinie, this.numeSofer, this.deschideUsile, this.areOprire, this.textRulat, this.model,this.nrCalatori);
    }

    public AutobuzBuilder setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
        return this;
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public AutobuzBuilder setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
        return this;
    }

    public AutobuzBuilder setAreOprire(boolean areOprire) {
        this.areOprire = areOprire;
        return this;
    }

    public AutobuzBuilder setTextRulat(String textRulat) {
        this.textRulat = textRulat;
        return this;
    }

    public AutobuzBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public AutobuzBuilder setNrCalatori(int nrCalatori) {
        this.nrCalatori = nrCalatori;
        return this;
    }
}
