class Atm
{
    public void payment(int ammout)
    {
        System.out.println("Payment process by ATM");
    }
}
class CraditCard extends Atm
{
    public void payment(int ammout)
    {
        System.out.println("Payment process by credit card");
    }
}
class DebitCard extends Atm {

    public void payment(int ammout)
    {
        System.out.println("Payment process by debit card");
    }
    
}

class AtmSystem
{
    public static void main(String[] args) {
        
        int ch=Integer.parseInt(args[0]);
        Atm obj=null;
        switch (ch) 
        {

            case 1:

                obj=new Atm();
                obj.payment(100);
                break;
            case 2:
                obj=new CraditCard();
                obj.payment(2000);
                break;

            case 3:
                obj=new DebitCard();
                obj.payment(3000);
                break;
        
            
        }
    }
}