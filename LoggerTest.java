
class  Logger{

    void log(String message)
    {
        System.out.println("concole log:"+message);
    }

}
class FileLogger extends Logger
{
    void log(String message)
    {
        System.out.println("file log is:"+message);
    }
}
public class LoggerTest {
    
    public static void main(String[] args) {
        
        Logger logger=new Logger();
        logger.log("application started");

        logger =new FileLogger();
        logger.log("Application crashed");
    }
}
