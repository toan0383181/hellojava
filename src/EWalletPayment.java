package src;
public class EWalletPayment extends Payment {

    private String phoneNumber;
    private double balance;

    public EWalletPayment(double amount,
                          String phoneNumber,
                          double balance) {
        super(amount);
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    @Override
    protected boolean validatePayment() {

        if (phoneNumber == null ||
            !phoneNumber.matches("\\d{10}")) {
            System.out.println("So dien thoai phai co 10 chu so.");
            return false;
        }

        double totalAmount = getAmount() + calculateFee();

        if (balance < totalAmount) {
            System.out.println("So du vi khong du.");
            return false;
        }

        return true;
    }

    @Override
    protected double calculateFee() {
        return 5000;
    }

    @Override
    protected boolean executePayment(double totalAmount) {

        System.out.println("Dang thanh toan qua vi dien tu...");

        if (balance < totalAmount) {
            return false;
        }

        balance -= totalAmount;

        System.out.printf("So du con lai: %.0f VND%n", balance);

        return true;
    }

    @Override
    protected void printPaymentFailure() {
        System.out.println("Thanh toan vi dien tu that bai.");
    }
}

