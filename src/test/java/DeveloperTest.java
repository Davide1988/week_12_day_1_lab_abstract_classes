import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer dev;

    @Before
    public void before(){

        dev = new Developer("Salomon", 34, 30000);
    }


    @Test
    public void canTestName(){
        assertEquals("Salomon", dev.getName());
    }

    @Test
    public void canChangeName(){
        dev.changeName(null);
        assertEquals("Salomon", dev.getName());
    }

    @Test
    public void canChangeNameSuccesfully(){
        dev.changeName("Albert");
        assertEquals("Albert", dev.getName());
    }



    @Test
    public void getNiNumber() {
        assertEquals(34, dev.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000, dev.getSalary(), 0.01);
    }


    @Test
    public void canGetARais(){
        dev.raiseSalary(2000);
        assertEquals(32000, dev.getSalary(), 0.01);
    }


    @Test
    public void negativeRaisShouldNotChangeSalary(){
        dev.raiseSalary(-2000);
        assertEquals(30000, dev.getSalary(), 0.01);
    }


    @Test
    public void canGetBonus(){
        assertEquals(300, dev.bonus(), 0.01);
    }
}
