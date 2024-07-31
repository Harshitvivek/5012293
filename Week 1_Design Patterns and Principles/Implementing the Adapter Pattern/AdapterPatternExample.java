// File: AdapterPatternExample.java
public class AdapterPatternExample {
    public static void main(String[] args) {
        // Using PayPal
        PayPal payPal = new PayPal();
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPal);
        payPalAdapter.processPayment(100.0);

        // Using Stripe
        Stripe stripe = new Stripe();
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);
        stripeAdapter.processPayment(200.0);

        // Using Square
        Square square = new Square();
        PaymentProcessor squareAdapter = new SquareAdapter(square);
        squareAdapter.processPayment(300.0);
    }
}
