class SuperClass
{
    public void show()
    {
        System.out.println("I am superclass method");
    }
}
class SubClass extends SuperClass
{
    public void show()
    {
        System.out.println("I am subclass method");
    }
}

class MethodOverride
{
    public static void main(String[] args) {

        SuperClass class1=new SuperClass();
        class1.show();
        SubClass class2=new SubClass();
        class2.show();
        
    }
}