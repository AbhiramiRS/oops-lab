import java.util.*;
class Area1
{
void calculateArea1(float x)
{
System.out.println("area of square :"+x*x+"sq units");
}
void calculateArea1(float x ,float y)
{
System.out.println("area  of the rectangle :"+x*y+"sq units");
}
void calculateArea1(double r)
{
double area=3.14*r*r;
System.out.println("Area of the circle :"+area+" sq units");
}
public static void main(String args[])
{
int s;
float l,b;
double r;
Area1 obj=new Area1();
Scanner sc = new Scanner(System.in);
System.out.println("enter side of square ");
s=sc.nextInt();
System.out.println("enter lengh and breadth of a rectangle");
l=sc.nextFloat();
b=sc.nextFloat();
System.out.println("enter radius of the circle");
r=sc.nextDouble();
obj.calculateArea1(s);
obj.calculateArea1(l,b);
obj.calculateArea1(r);
}
}