import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.techStaff.DatabaseAdmin;

import javax.xml.crypto.Data;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Tom", 123, 100000);
    }

    @Test
    public void hasName() {
        assertEquals("Tom", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals(123, databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(100000.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(5000.00);
        assertEquals(105000.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        databaseAdmin.payBonus();
        assertEquals(101000.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canNotIncreaseSalaryByNegativeNumber() {
        databaseAdmin.raiseSalary(-10.00);
        assertEquals(100000.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canSetName() {
        databaseAdmin.setName("Roger");
        assertEquals("Roger", databaseAdmin.getName());
    }

    @Test
    public void cantSetNullName() {
        databaseAdmin.setName(null);
        assertEquals("Tom", databaseAdmin.getName());
    }
}
