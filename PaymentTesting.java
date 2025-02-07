class Payment{

    void processPayment(double amount)
    {
        System.out.println("Processing payment is $:"+amount);
    }
}
class CardPayment extends Payment
{
    void processPayment(double amount)
    {
        System.out.println("Processing payment is:"+amount);
    }
}
class PaypalPayment extends Payment
{
    void processPayment(double amount)
    {
        System.out.println("Processing payment is :"+amount);
    }
}
    

public class PaymentTesting {
    
    public static void main(String[] args) {
        Payment payment1 = new CardPayment();
        Payment payment2 = new PaypalPayment();

        payment1.processPayment(100.00);
        payment2.processPayment(200.90);
    }
}
