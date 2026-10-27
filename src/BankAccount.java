package src;

public class BankAccount {
    public String accountNumber;
    public String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount [accountNumber=" + accountNumber + ", ownerName=" + ownerName + ", balance=" + balance
                + "]";
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("nap tien thanh cong:" + amount);
            System.out.println("so du hien tai:" + balance);
        }
        else{
            System.out.println("nap tien that bai");
        }
    }

    public void withdraw(double amount){
        if (amount < 0) {
            System.out.println("loi so tien rut nho hon 0");
        }
        else if(amount > balance){
            System.out.println("so tien khong du");
        }
        else{
            balance -= amount;
            System.out.println("rut tien thanh cong:" + amount);
            System.out.println("so du hien tai:" + balance);
            
        }
        
    }
}
