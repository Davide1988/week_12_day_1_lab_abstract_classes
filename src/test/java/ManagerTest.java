import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){

        manager = new Manager("Bobby", 23456, 50000,"IT");
    }

    @Test
    public void canTestName(){
        assertEquals("Bobby", manager.getName());
    }

    @Test
    public void getNiNumber() {
        assertEquals(23456, manager.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000, manager.getSalary(), 0.01);
    }

    @Test
    public void getDepName() {
        assertEquals("IT", manager.getDepName());
    }

    @Test
    public void canGetARais(){
        manager.raiseSalary(2000);
        assertEquals(52000, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(500, manager.bonus(), 0.01);
    }

}
