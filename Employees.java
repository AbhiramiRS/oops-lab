import java.util.*;
class Employees
{
int eno;
String ename;
int esalary;
Scanner s =new Scanner(System.in);

void getdetails()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter eno:");
this.eno=sc.nextInt();
System.out.println("enter ename:");
this.ename=sc.next();
System.out.println("enter salary:");
this.esalary=sc.nextInt();
}
void display()
{
System.out.println("employee no:"+this.eno);
System.out.println("employee name:"+this.ename);
System.out.println("employee salary:"+this.esalary);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Employees[]a1=new Employees[5];
int f=0;
for(int i=0;i<5;i++)
{
a1[i]=new Employees();
a1[i].getdetails();
}
System.out.println("enter the id to be searched:");
int id=sc.nextInt();
for(int i=0;i<5;i++)
{
if(id==a1[i].eno)
 {
     a1[i].display();
     break;
}
else
f++;
}
if(f!=0)
{
System.out.println("no match is found");
}
}
}