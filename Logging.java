class  Logger
{
    void log(String message)BankTest 
    {
        System.out.println("INFO :"+message);
    }
    void log(String message, int errorCode)
    {
        System.out.println("ERROR [" + errorCode + "]: " + message);
    }
    
}


public class Logging {
    
    public static void main(String[] args) {
        
        Logger  logger=new Logger();
        logger.log("Hii");
        logger.log("Hii", 1212);
    }

}
