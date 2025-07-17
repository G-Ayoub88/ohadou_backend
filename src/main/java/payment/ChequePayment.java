package payment;

public class ChequePayment implements PaymentMethod {
    private String chequeNumber;
    private double amount;

    public ChequePayment(String chequeNumber, double amount) {
        this.chequeNumber = chequeNumber;
        this.amount = amount;
    }

    @Override
    public void processPayment() {
        System.out.println("Paiement par chèque avec le numéro : " + chequeNumber);
    }
}
