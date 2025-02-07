class Point 
{
    private int x;
    private int y;

    public Point(int x, int y)
    {
        this.x=x;
        this.y=y;

    }

    public boolean equals(Point that)
    {
         boolean reult=this.x==that.x && this.y==that.y;
         return reult;

    }
}

public class PointChecker {
    
    public static void main(String[] args) {
        
        Point p1=new Point(2, 2); // address - 1000

        Point p2=new Point(2, 2); // address -2000

        Point p3=p2;

        if(p1==p2)
        {
            System.out.println("p1 & p2 are equal by ==");
        }
        else{
            System.out.println("P1  & p2 are not equal");
        }

        if(p1.equals(p2))
        {
            System.out.println("p1 and p2 are equals by content");
        }
        else
        {
            System.out.println("P1  & p2 asre not equal by content");
        }

        if(p3.equals(p2))
        {
            System.out.println("p2 & p3 are  equal by content");
        }
        else{
            System.out.println("p2 & p3 are not equal by content");
        }



    }
}
