
class base {

    public void show()
    {
        System.out.println("I am base class:");
    }
}
 class  SubClass extends base {
    public void show()
    {
        System.out.println("I am sub-class method:");
    }
}
class Subclass2 extends SubClass
{
    public  void show()
    {
        System.out.println("I am sub-class 2 method:");
    }
}

public class MethodOverrideObject {
    public static void main(String[] args) {
        base obj=null;
        int choice=Integer.parseInt(args[0]);
        switch (choice) {
            case 1:
                obj=new base();
                break;
            case 2:
                obj=new SubClass();
                break;
            case 3:
                obj=new Subclass2();
                break;
        
        
        }
        obj.show();

    }
}
