class Bank{

    public double getInterstRate()
    {
        return 5.0;
    }
}
class SBI extends Bank{

    public double getInterstRate()
    {
        return 8.0;
    }
}
class HDFC extends Bank
{
    public double getInterstRate()
    {
        return 7.0;
    }
}
public class BankingTest  {
    
    public static void main(String[] args) {
        
        Bank bank=null;
        int ch=Integer.parseInt(args[0]);
        switch (ch) {
            case 1:
                bank=new Bank();
                break;
            
            case 2:
                bank=new SBI();
                break;
            
            case 3:
                bank=new HDFC();
                break;

        

        }
       System.out.println( bank.getInterstRate()); //we acceess the runtime action.
       

       
    }
}
