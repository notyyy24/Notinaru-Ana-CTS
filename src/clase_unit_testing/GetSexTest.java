package clase_unit_testing;

import static org.junit.Assert.*;

public class GetSexTest {
    private Persoana persoana;

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.Test
    public void getSexRight() {
        persoana = new Persoana("Ana","6000524460011");
        String sex = persoana.getSex();
        assertEquals("F",sex);
    }

    @org.junit.Test
    public void getSexBoundary() {
        persoana = new Persoana("Mihai","5000101460011");
        String sex = persoana.getSex();
        assertEquals("M",sex);
    }
    @org.junit.Test
    public void getSexCrossCheck() {
        persoana = new Persoana("Mihai","6000101460011");
        int primaCifra = persoana.CNP.charAt(0);
        String sex = persoana.getSex();
        int cifra;
        if (sex == "M") {
            cifra =1;
        }
        else {
            cifra =2;
        }
        assertEquals(cifra % 2 == 1, primaCifra % 2 == 1);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexErrorCondition() {
        persoana = new Persoana("Mihai","0000101460011");
        String sex = persoana.getSex();
    }

    @org.junit.Test(timeout = 100)
    public void getSexPerformance() {
        persoana = new Persoana("Mihai","5000101460011");
        String sex = persoana.getSex();
    }

    @org.junit.Test
    public void getSexOutputFormat() {
        persoana = new Persoana("Mihai","5000101460011");
        String sex = persoana.getSex();
        assertEquals(1,sex.length());
    }

    @org.junit.Test
    public void getSexRangeBetween1800and1899() {
        persoana = new Persoana("Mihai","3000101460011");
        String sex = persoana.getSex();
        assertEquals("M",sex);
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void getSexExistence() {
        persoana = new Persoana("Mihai",null);
        String sex = persoana.getSex();
    }
}