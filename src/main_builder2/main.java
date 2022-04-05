package main_builder2;

import builder_varianta2.AutobuzBuilder;
import builder_varianta2.AutobuzLinie;

public class main {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder= new AutobuzBuilder();
        autobuzBuilder.setAreOprire(false).setNrLinie(25);

        AutobuzLinie autobuz = autobuzBuilder.build();
        System.out.println(autobuz.toString());
    }
}
