package main_builder;

import builder.AutobuzBuilder;
import builder.AutobuzLinie;

public class main {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder= new AutobuzBuilder().setNumeSofer("Ion Marian").setTextRulat("END Line");
        AutobuzLinie autobuzLinie=autobuzBuilder.build();
        //autobuzBuilder.setNumeSofer("Ion");
        System.out.println(autobuzLinie);
    }
}
