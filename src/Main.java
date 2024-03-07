import entities.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Manager mario = new Manager("Mario Rossi", 25, Department.ADMINISTRATION);
        FullTimeEmployee carlo = new FullTimeEmployee("Carlo Bianchi", 12, Department.ADMINISTRATION);
        FullTimeEmployee marco = new FullTimeEmployee("Marco Verdi", 10, Department.PRODUCTION);
        FullTimeEmployee giovanna = new FullTimeEmployee("Giovanna Neri", 10, Department.PRODUCTION);
        PartTimeEmployee stefano = new PartTimeEmployee("Stefano Marroni", 9, Department.PRODUCTION);
        FullTimeEmployee antonio = new FullTimeEmployee("Antonio Azzurri", 9, Department.SALE);
        PartTimeEmployee maria =  new PartTimeEmployee("Maria Grigi", 8, Department.SALE);
        Employee[] employees = {mario, carlo, marco, giovanna, stefano, antonio, maria};
        System.out.println("LIST OF EMPLOYEES:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " (" + employee.getSerialNum() + ") monthly salary: " + employee.calculateSalary() + "€");
        }
        System.out.println();
        Volunteer john = new Volunteer("John Reds", 20, new String[]{"experienced salesman", "personal trainer"});
        Volunteer jack = new Volunteer("Jack White", 26, new String[]{"experienced salesman"});
        Volunteer clara = new Volunteer("Clara Blues", 22, new String[]{"personal trainer"});
        CheckAtWorkplace[] checkIns = {mario, carlo, marco, giovanna, stefano, antonio, maria, john, jack, clara};
        System.out.println("CHECK-IN TIMES");
        for (CheckAtWorkplace person : checkIns) {
            person.checkIn();
        }
    }
}