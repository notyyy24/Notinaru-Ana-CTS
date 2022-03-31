package factoryMethod;

public class AutobuzFactory implements Factory{
    public MijlocTransport createObject(String nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }

}
