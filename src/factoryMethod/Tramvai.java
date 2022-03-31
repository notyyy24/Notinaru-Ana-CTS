package factoryMethod;

public class Tramvai  extends MijlocTransport {

    public Tramvai(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        return "Tramvai " +
                "nrInmatriculare='" + nrInmatriculare + '\'' +
                ' ';
    }
}
