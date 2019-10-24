package deqo.assu;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


import static org.junit.Assert.*;


public class ItemTest {
    Item i1;
    @Before
    public void init(){
        i1 = new Item("Pau");
    }
    @Test
    public void testGetNomville() {
        assertEquals("nomville bonne valeur",i1, "Pau");
    }

    @Test
    public void testSetNomville() {
        assertEquals("nomville modifié", i1, "nvc");
    }
}
