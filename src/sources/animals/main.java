package sources.animals;

public class main {
    public static void main(String[] args) {
        ZOO zoo=new ZOO("zoo1", new IngrijitorZoo("Ana"));
        Girafa g = new Girafa("girafa1");
        Zebra z = new Zebra("zebra1");
        Girafa g2 = new Girafa("girafa2");
        Zebra z2 = new Zebra("zebra2");

        zoo.adaugaAnimal(g);
        zoo.adaugaAnimal(g2);
        zoo.adaugaAnimal(z);
        zoo.adaugaAnimal(z2);

        zoo.hranesteAnimal();
    }
}