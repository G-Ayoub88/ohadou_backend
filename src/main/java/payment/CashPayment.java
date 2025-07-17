package payment;

public class CashPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Paiement en espèces effectué.");
    }
}