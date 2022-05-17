package clase_unit_testing;

import static org.junit.Assert.*;

public class GetVarstaTest {
    private Persoana persoana;

    @org.junit.Test
    public void getVarstaRight() {
        persoana = new Persoana("Ana","6000524460011");
        int varsta = persoana.getVarsta();
        assertEquals(21,varsta);
    }

    @org.junit.Test
    public void getVarstaBoundary1800() {
        persoana = new Persoana("mihai","3000101460011");
        int varsta = persoana.getVarsta();
        assertEquals(222,varsta);
    }

    @org.junit.Test
    public void getVarstaBoundary1899() {
        persoana = new Persoana("mihai","3991231460011");
        int varsta = persoana.getVarsta();
        assertEquals(122,varsta);
    }

    //@org.junit.Test
    //public void getVarstaBoundaryZiuaCurenta() {
    //    persoana = new Persoana("mihai","5220517460011");
    //    int varsta = persoana.getVarsta();
    //    assertEquals(0,varsta);
    //}

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getVarstaErrorConditionVarsta() {
        persoana = new Persoana("Mihai","5220518460011");
        int varsta = persoana.getVarsta();
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void getVarstaErrorConditionCNP() {
        persoana = new Persoana("Mihai",null);
        int varsta = persoana.getVarsta();
    }

    @org.junit.Test(timeout = 100)
    public void getVarstaPerformance() {
        persoana = new Persoana("Mihai","5000524460011");
        int varsta = persoana.getVarsta();
    }

    @org.junit.Test
    public void getVarstaOrder() {
        persoana = new Persoana("Ana","6000524460011");
        int varsta = persoana.getVarsta();
       Persoana persoana1 = new Persoana("Mihai","5000410460011");
       assertTrue(persoana1.getVarsta()> persoana.getVarsta());
    }
}
