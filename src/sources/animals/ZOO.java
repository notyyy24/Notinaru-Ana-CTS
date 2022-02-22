package sources.animals;

import java.util.List;

public class ZOO {
    private String nume;
    private IngrijitorZoo ingrijitorZoo;
    private List<Animal> animale;

    public ZOO(String nume, IngrijitorZoo ingrijitorZOO, List<Animal> animale) {
        this.nume = nume;
        this.ingrijitorZoo = ingrijitorZOO;
        this.animale = animale;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public IngrijitorZoo getIngrijitorZOO() {
        return ingrijitorZoo;
    }

    public void setIngrijitorZOO(IngrijitorZoo ingrijitorZOO) {
        this.ingrijitorZoo = ingrijitorZOO;
    }

    public List<Animal> getAnimale() {
        return animale;
    }

    public void setAnimale(List<Animal> animale) {
        this.animale = animale;
    }

    public void adaugaAnimal (Animal animal) {
        animale.add(animal);
    }

    public void hranesteAnimal() {

        for (Animal a : animale)
            ingrijitorZoo.hranesteAnimal(a,"fan");
    }
}
