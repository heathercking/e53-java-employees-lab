import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before() {
        developer = new Developer("Tom", 123, 100000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Tom", developer.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals(123, developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(100000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(5000.00);
        assertEquals(105000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        developer.payBonus();
        assertEquals(101000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canNotIncreaseSalaryByNegativeNumber() {
        developer.raiseSalary(-10.00);
        assertEquals(100000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canSetName() {
        developer.setName("Roger");
        assertEquals("Roger", developer.getName());
    }

    @Test
    public void cantSetNullName() {
        developer.setName(null);
        assertEquals("Tom", developer.getName());
    }

}
