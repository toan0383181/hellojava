
package src;

public abstract class Employee {

    private String id;
    private String name;
    protected double baseSalary;

    public static int count = 0;

    public static final String BANK_NAME = "VietTech Bank";

    public Employee(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;

        count++;
    }

    public abstract double calculateSalary();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public static int getCount() {
        return count;
    }

    
public void displayInfo() {
    System.out.println("Ngan hang: " + BANK_NAME);
    System.out.println("Ma nhan vien: " + id);
    System.out.println("Ho ten: " + name);
    System.out.println("Luong co ban: " + baseSalary);
    System.out.println("Luong thuc nhan: " + calculateSalary());
}

}
