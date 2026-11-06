package src;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public CreditCardPayment(double amount , String cardNumber , String cvv , String expiryDate){
       super(amount);
       this.cardNumber = cardNumber;
       this.cvv = cvv;
       this.expiryDate = expiryDate; 
    }
    @Override
    protected boolean validatePayment() {

        
        if (cardNumber == null || !cardNumber.matches("\\d{16}")) {
            System.out.println("So the phai co dung 16 chu so!");
            return false;
        }

        
        if (cvv == null || !cvv.matches("\\d{3}")) {
            System.out.println("CVV phai co dung 3 chu so!");
            return false;
        }

        
        try {
            YearMonth expiry = YearMonth.parse(
                expiryDate,
                DateTimeFormatter.ofPattern("MM/uuuu")
            );

            if (expiry.isBefore(YearMonth.now())) {
                System.out.println("The tin dung da het han!");
                return false;
            }

        } catch (Exception e) {
            System.out.println("Ngay het han khong hop le!");
            return false;
        }

        return true;
    }

    @Override
    protected double calculateFee() {
        return getAmount() * 0.02;
    }

    @Override
    protected boolean executePayment(double totalAmount) {

        System.out.printf(
            "Dang tru %.0f VND tu the tin dung...%n",
            totalAmount
        );

        return true;
    }

    @Override
    protected void printPaymentFailure() {
        System.out.println("Thanh toan the tin dung that bai!");
    }
}
