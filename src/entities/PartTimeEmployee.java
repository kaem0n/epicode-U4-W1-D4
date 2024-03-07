package entities;

public class PartTimeEmployee extends Employee {
    // ATTRIBUTES
    private final int workingHours;

    // CONSTRUCTORS
    public PartTimeEmployee(String name, double hourlySalary, Department department) {
        super(name, hourlySalary, department);
        this.workingHours = 4;
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
        return "PartTimeEmployee{" +
                "name='" + name + '\'' +
                ", serialNum='" + serialNum + '\'' +
                ", hourlySalary=" + hourlySalary +
                ", department=" + department +
                '}';
    }

    @Override
    public void checkIn() {
        System.out.println(this.name + " check-in at 08:00 AM");
    }
}
