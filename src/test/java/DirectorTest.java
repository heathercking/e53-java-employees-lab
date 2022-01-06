import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before () {
        director = new Director("Bob", 123, 20000.00, "HR", 50000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Bob", director.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals(123, director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(20000.00, director.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(5000.00);
        assertEquals(25000.00, director.getSalary(), 0.0);
    }

    @Test
    public void canNotIncreaseSalaryByNegativeNumber() {
        director.raiseSalary(-10.00);
        assertEquals(20000.00, director.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        director.payBonus();
        assertEquals(20400.00, director.getSalary(), 0.0);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("HR", director.getDeptName());
    }

    @Test
    public void canSetDeptName() {
        director.setDeptName("Accounts");
        assertEquals("Accounts", director.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(50000.00, director.getBudget(), 0.0);
    }

    @Test
    public void canSetName() {
        director.setName("Roger");
        assertEquals("Roger", director.getName());
    }

    @Test
    public void cantSetNullName() {
        director.setName(null);
        assertEquals("Bob", director.getName());
    }

}
