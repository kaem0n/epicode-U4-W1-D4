package entities;

public abstract class Employee implements CheckAtWorkplace {
    // ATTRIBUTES
    protected final String name;
    protected final String serialNum;
    protected final double hourlySalary;
    protected Department department;

    // CONSTRUCTORS
    public Employee(String name, double hourlySalary, Department department){
        this.name = name;
        this.serialNum = Integer.toHexString(hashCode());
        this.hourlySalary = hourlySalary;
        this.department = department;
    }

    // GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public double getSalary() {
        return hourlySalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    // METHODS
    public abstract double calculateSalary();
}
