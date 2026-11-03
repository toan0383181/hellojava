
package src;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(
            "NV01", "Nguyen Van A", 15000000, 3000000
        );

        Employee e2 = new Intern(
            "NV02", "Nguyen Van B", 5000000, 0.8
        );

        Employee e3 = new FullTimeEmployee(
            "NV03", "Nguyen Van C", 12000000, 2000000
        );

        e1.displayInfo();
        System.out.println("----------------");

        e2.displayInfo();
        System.out.println("----------------");

        e3.displayInfo();
        System.out.println("----------------");

        System.out.println("Tong so nhan vien: "
                + Employee.getCount());
    }
}
