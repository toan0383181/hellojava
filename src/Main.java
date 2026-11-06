package src;
public class Main {
    public static void main(String[] args) {
         Payment[] payments = new Payment[6];

        
        payments[0] = new CreditCardPayment(
            1000000,
            "1234567890123456",
            "123",
            "12/2028"
        );

        
        payments[1] = new CreditCardPayment(
            1000000,
            "123456",
            "123",
            "12/2028"
        );

        
        payments[2] = new EWalletPayment(
            200000,
            "0987654321",
            500000
        );

       
        payments[3] = new EWalletPayment(
            500000,
            "0987654321",
            100000
        );

       
        payments[4] = new BankTransferPayment(
            300000,
            "123456789",
            "Vietcombank"
        );

        
        payments[5] = new BankTransferPayment(
            300000,
            "123456789",
            ""
        );

        
        for (Payment payment : payments) {
            payment.processPayment();
        }
    
    }
}
