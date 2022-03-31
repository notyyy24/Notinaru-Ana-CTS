package factoryMethod;

public abstract class MijlocTransport {
    String nrInmatriculare;


    protected MijlocTransport(String nrInmatriculare) {
        this.nrInmatriculare=nrInmatriculare;
    }

    @Override
    public String toString() {
        return "MijlocTransport{" +
                "nrInmatriculare='" + nrInmatriculare + '\'' +
                '}';
    }
}
