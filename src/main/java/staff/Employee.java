package staff;

public abstract class Employee {

    private String name;
    private int niNumber;
    protected double salary;

    public Employee(String name, int niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if(name != null){
            this.name = name;
        }
    }

    public void setNiNumber(int niNumber) {
        this.niNumber = niNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double salaryIncrease) {
        if(salaryIncrease >= 0) {
            this.salary += salaryIncrease;
        }
    }

    public void payBonus() {
        this.salary += this.salary / 100;
    }
}
