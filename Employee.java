package Training;

public class Employee {

    String firstName;
    String lastName;
    double monthlySalary;


    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {

        if(monthlySalary > 0.0)
            this.monthlySalary = monthlySalary;

    }

}

class EmployeeTest {

    public static void main(String[] args) {
        Employee saniya = new Employee("Amatul","Saniya", 500.0);
        Employee creigh = new Employee("Creigh", "Battle", 2.0); //he has worked for less apparently

        System.out.println(saniya.getMonthlySalary()*12);
        System.out.println(creigh.getMonthlySalary()*12);

        System.out.println("With 10% raise:");

        saniya.setMonthlySalary(saniya.getMonthlySalary() * 1.10);
        creigh.setMonthlySalary(creigh.getMonthlySalary()*1.10);

        System.out.println(saniya.getMonthlySalary()*12);
        System.out.println(creigh.getMonthlySalary()*12);
    }

}
