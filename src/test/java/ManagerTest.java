import staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before () {
        manager = new Manager("Bob", 123, 20000.00, "HR");
    }

    @Test
    public void hasName() {
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals(123, manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(20000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(5000.00);
        assertEquals(25000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        manager.payBonus();
        assertEquals(20200.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("HR", manager.getDeptName());
    }

    @Test
    public void canSetDeptName() {
        manager.setDeptName("Accounts");
        assertEquals("Accounts", manager.getDeptName());
    }

    @Test
    public void canNotIncreaseSalaryByNegativeNumber() {
        manager.raiseSalary(-10.00);
        assertEquals(20000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canSetName() {
        manager.setName("Roger");
        assertEquals("Roger", manager.getName());
    }

    @Test
    public void cantSetNullName() {
        manager.setName(null);
        assertEquals("Bob", manager.getName());
    }

}
