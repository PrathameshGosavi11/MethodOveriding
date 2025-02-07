 class Employee
 {
    public void calculateSalary(int salary)
    {
        System.out.println(" salary is :"+salary);
    }
 }
 class FullTimeEmployee extends Employee
 {
    public void calculateSalary(int salary)
    {
        System.out.println("salary of  fulltime worker is:"+salary);
    }
 }
 class Contractype extends Employee
 {
    public void calculateSalary(int salary)
    {
        System.out.println("contract type of employee salary :"+salary);
    }
 }
 class EmployeeTest  {
    
    public static void main(String[] args) {
        
        Employee obj=new FullTimeEmployee(); //base class reference
        obj.calculateSalary(12000);

        obj=new Contractype(); //here one object different behaviour.
        obj.calculateSalary(3000);
    }
}
