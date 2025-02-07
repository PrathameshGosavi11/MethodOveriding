 
 class Database
 {
    void connect()
    {
        System.out.println("database connecting generic");
    }
 }
 class PostgresDatabase extends Database
 {
    void connect()
    {
        System.out.println("Database are connect with postgrey");
    }
 }

 class MySQLDatabase  extends Database
 {
    void connect()
    {
        System.out.println("mysql database are connect");
    }
 }
 class DatabaseTest  {
    
    public static void main(String[] args) {
        
        Database database=new Database();
        database.connect();

        database=new PostgresDatabase();
        database.connect();

        database=new MySQLDatabase();
        database.connect();
    }
}
