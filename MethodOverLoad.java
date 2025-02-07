class Test
{
    void show()
    {
        System.out.println("called show method");
    }
    void show()
    {
        System.out.println("called 2nd show ");
    }

}

public class MethodOverLoad {
    public static void main(String[] args) {
        Test t=new Test();
        t.show();
        
    }
}
