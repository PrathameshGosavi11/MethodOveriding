class Payment{

    void pay(int amount)
    {
        System.out.println("Paid " + amount + " using cash.");
    }
    void pay(int amount, String cardNumber)
    {
        System.out.println("Paid " + amount + " using card: " + cardNumber);
    }
    void pay(int amount, String upiId, boolean isUPI)
    {
        System.out.println("Paid " + amount + " using UPI: " + upiId);

    }
}
 public class Methodload {

    public static void main(String[] args) {
        
        Payment payment = new Payment();
        payment.pay(1000);                     // Cash payment
        payment.pay(2000, "1234-5678-9876-5432"); // Card payment
        payment.pay(1500, "user@upi", true);   // UPI payment
    }
}
