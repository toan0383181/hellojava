package src;


import java.util.UUID;

public abstract class Payment {

    private String transactionId;
    private double amount;

    public Payment(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "So tien phai lon hon 0!"
            );
        }

        this.amount = amount;
        this.transactionId = UUID.randomUUID().toString();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    
    public final void processPayment() {

        System.out.println("\n================================");
        System.out.println("MA GIAO DICH: " + transactionId);
        System.out.printf("So tien: %.0f VND%n", amount);

   
        initializeTransaction();

        
        if (!validatePayment()) {
            System.out.println("Thong tin khong hop le!");
            System.out.println("Giao dich da bi huy.");
            return;
        }

        double fee = calculateFee();
        double totalAmount = amount + fee;

        System.out.printf("Phi giao dich: %.0f VND%n", fee);
        System.out.printf("Tong thanh toan: %.0f VND%n",
                          totalAmount);

        
        if (executePayment(totalAmount)) {
            printReceipt(totalAmount);
        } else {
            printPaymentFailure();
        }
    }

    protected void initializeTransaction() {
        System.out.println("Khoi tao giao dich thanh cong.");
    }

    protected void printReceipt(double totalAmount) {
        System.out.println("THANH TOAN THANH CONG!");
        System.out.println("Ma giao dich: " + transactionId);
        System.out.printf("Tong tien: %.0f VND%n", totalAmount);
        System.out.println("Hoa don da duoc xac nhan.");
    }

    protected abstract boolean validatePayment();

    protected abstract double calculateFee();

    protected abstract boolean executePayment(double totalAmount);

    protected abstract void printPaymentFailure();
}
