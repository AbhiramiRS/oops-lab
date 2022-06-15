package  Graphics;
import java.io.*;
import java.util.*;
interface sp
{
final int score=10;
public void show();
}
public class Student1 implements sp
{
int rollno;
String name;
Scanner sc =new Scanner(System.in);
public void get()
{
 rollno=20;
name ="Abhi";
}
public void show()
{
 System.out.println("rollno,Name,Score:"+rollno+" "+name+" "+score);
}
}
