class Test
{
    void show(int a) //here change the type 
    {
        System.out.println("called show method");
    }
    void show(String b)  //here also change the type.
    {
        System.out.println("called 2nd show ");
    }

}

public class MethodOverLoad {
    public static void main(String[] args) {
        Test t=new Test();
       // t.show(); // call the 0 argument show method.

       t.show( 11); 
       t.show( "Pratham");

    }
}
