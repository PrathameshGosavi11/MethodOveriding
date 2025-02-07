class SuperClass  
{
    public void show()
    {
        System.out.println("I am superclass method");
    }
}
class SubClass extends SuperClass
{
    public void show() //In this case siganature are same then override the method
    {
        System.out.println("I am subclass method");
    }
}
class Subclass2 extends SubClass
{
    public void show()
    {
        System.out.println("I am another subclass ");
    }
}
class MethodOverride
{
    public static void main(String[] args) {

        SuperClass class1=new SuperClass(); 
        class1.show();
         class1=new SubClass(); // we use the base class object & called derived class Method.
        class1.show();
        class1=new Subclass2(); 
        class1.show();
        
    }
}