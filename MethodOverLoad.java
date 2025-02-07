class Test
{
    void show() //0 argument
    {
        System.out.println("called show method");
    }
    void show(int a) // 1 argument
    {
        System.out.println("called 2nd show ");
    }

}

public class MethodOverLoad {
    public static void main(String[] args) {
        Test t=new Test();
       // t.show(); // call the 0 argument show method.

       t.show(12); // call the 1 parameter show method.

    }
}
