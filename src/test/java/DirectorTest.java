import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {


    private Director director;

    @Before
    public void before(){

        director = new Director("Bill", 23456000, 100000,"IT", 120000);

    }


    @Test
    public void canTestName(){
        assertEquals("Bill", director.getName());
    }

    @Test
    public void getNiNumber() {
        assertEquals(23456000, director.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(100000, director.getSalary(), 0.01);
    }

    @Test
    public void getDepName() {
        assertEquals("IT", director.getDepName());
    }

    @Test
    public void canGetARais(){
        director.raiseSalary(2000);
        assertEquals(102000, director.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(2000, director.bonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(120000, director.getBudget(), 0.01);
    }
}
