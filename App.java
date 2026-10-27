import src.BankAccount;
import src.Student;

public class app {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("0383181564","toan",10000);
        
        System.out.println("So tai khoan:" + acc.getAccountNumber());
        System.out.println("Ten chu tai khoan:" + acc.getOwnerName());
        System.out.println("So du hien tai:" + acc.getBalance());
        
        System.out.println("\n------NAP TIEN------");
        acc.deposit(5000);

        System.out.println("\n------RUT TIEN------");
        acc.withdraw(2000);
        
        System.out.println("\n------SO DU CUOI CUNG------");
        acc.deposit(5000);
        acc.withdraw(10000);
        System.out.println("So du hien tai:" + acc.getBalance());
    }
}
