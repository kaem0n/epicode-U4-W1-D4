package entities;

public class Director extends Employee {
    // ATTRIBUTES
    private final int workingHours;

    // CONSTRUCTORS
    public Director(String name, double hourlySalary, Department department) {
        super(name, hourlySalary, department);
        this.workingHours = 6;
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
        return "Director{" +
                "serialNum='" + serialNum + '\'' +
                ", hourlySalary=" + hourlySalary +
                ", department=" + department +
                '}';
    }

    @Override
    public void checkIn() {
        System.out.println(this.name + " check-in at 09:00 AM");
    }
}
