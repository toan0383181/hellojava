package src;

public class BankTransferPayment extends Payment{
    private String accountNumber;
    private String bankName;

    public BankTransferPayment (double amount , String accountNumber , String bankName){
        super(amount);
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    @Override 
    protected boolean validatePayment(){
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            System.out.println("So tai khoan ko dc de trong");
            return false;
        }

        if (bankName == null || bankName.trim().isEmpty()) {
            System.out.println("Ten ngan hang khong dc de trong");
            return false;
        }

        return true;
    }
    @Override 
    protected double calculateFee(){
        return 0;
    }

    @Override 
    protected boolean executePayment(double totalAmount){
        String transferContent = "PAY_" + getTransactionId();
        System.out.println("Dang tao yeu cau chuyen khoan...");
        System.out.println("Ngan hang: " + bankName);
        System.out.println("So tai khoan: " + accountNumber);

        System.out.printf("So tien can chuyen: %.0f VND%n",
                          totalAmount);

        System.out.println("Noi dung chuyen khoan: "
                           + transferContent);

        System.out.println("Huong dan khach hang chuyen khoan.");

        return true;
    }
    @Override 
    protected void printPaymentFailure(){
        System.out.println("chuyen khoan that bai");
    }
}
