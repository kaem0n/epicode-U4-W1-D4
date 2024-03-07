package entities;

public class FullTimeEmployee extends Employee {
    // ATTRIBUTES
    private final int workingHours;

    // CONSTRUCTORS
    public FullTimeEmployee(String name, double hourlySalary, Department department) {
        super(name, hourlySalary, department);
        this.workingHours = 8;
    }

    // GETTERS & SETTERS
    public int getWorkingHours() {
        return workingHours;
    }

    // METHODS
    @Override
    public double calculateSalary() {
        return this.hourlySalary * (workingHours * 21);
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "name='" + name + '\'' +
                ", serialNum='" + serialNum + '\'' +
                ", hourlySalary=" + hourlySalary +
                ", department=" + department +
                '}';
    }

    @Override
    public void checkIn() {
        System.out.println(this.name + " check-in at 07:00 AM");
    }
}
