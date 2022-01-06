//import org.junit.Before;
//import org.junit.Test;
//import staff.Employee;
//
//import static org.junit.Assert.assertEquals;
//
//public class EmployeeTest {
//
//    private Employee employee;
//
//
//
//    @Before
//    public void before() {
//        employee = new Employee("Tom", 123, 100000.00);
//    }
//
//    @Test
//    public void hasName() {
//        assertEquals("Tom", employee.getName());
//    }
//
//    @Test
//    public void hasNINumber() {
//        assertEquals(123, employee.getNiNumber());
//    }
//
//    @Test
//    public void hasSalary() {
//        assertEquals(100000.00, employee.getSalary(), 0.0);
//    }
//
//    @Test
//    public void canRaiseSalary() {
//        employee.raiseSalary(5000.00);
//        assertEquals(105000.00, employee.getSalary(), 0.0);
//    }
//
//    @Test
//    public void canPayBonus() {
//        employee.payBonus();
//        assertEquals(101000.00, employee.getSalary(), 0.0);
//    }
//
//
//}
