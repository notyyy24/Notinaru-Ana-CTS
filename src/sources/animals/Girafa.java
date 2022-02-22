package sources.animals;

import static java.lang.System.out;

public class Girafa extends Animal {

    public Girafa(String nume) {
        super(nume);
    }

    @Override
    public void mananca(String mancare) {

        out.println("Girafa mananca" + mancare );
    }
}