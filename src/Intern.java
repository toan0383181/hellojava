package src;

public class Intern extends Employee {

    private double supportRate;

    public Intern(String id, String name,double baseSalary, double supportRate) {
        super(id, name, baseSalary);
        this.supportRate = supportRate;
    }

    @Override
    public double calculateSalary() {
        return baseSalary * supportRate;
    }
}
