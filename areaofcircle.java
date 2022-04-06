import java .util.*;

class AreaofCircle
{
public static void main(String args[])
{
Scanner s=new Scanner (System.in);
System.out.println("Enter the radius:");
double rad=s.nextDouble();
Area a=new Area(rad);
System.out.println("Area of circle is:"+a.area);
}
}
class Area
{
double area;
Area(double r)
{
 area=3.14*r*r;
}
}
