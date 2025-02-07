class Student
{
    private String phone;
    private String name;

    public Student(String phone,String name)
    {
        this.phone=phone;
        this.name=name;
        
    }

    public String toString()
    {
        return phone +":"+name;
    }
}
public class MethodOver {
    
    public static void main(String[] args) {
        
        Student obj=new Student("8668581788","Pratham");
        Student obj2=new Student("9518968660","Tushar");

        String str=new String("Banty");

        System.out.println("str"+str); //Banty
        System.out.println("Object is:"+obj.toString());// Object is:Student@85ede7b
        System.out.println("Object is:"+obj2.toString()); // Object is:Student@5674cd4d

        // 85ede7b--> define your identity. it is a hashcode.
        // here toString method are not present but class have parent class is a 
        //object class and in that object class have to String method.
    }
}
