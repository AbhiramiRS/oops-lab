import java.util.*;
class Multidimensionalarray
{
public static void main(String[]args)
{
int a[ ][ ]=new int[2][3];
int i,j;
Scanner s=new Scanner(System.in);
System.out.println("enter array elements:");
for( i=0;i<2;i++)
{
 for(j=0;j<3;j++)
{
  a[i][j]=s.nextInt( );
}
}
System.out.println("Array elements are");
{
for( i=0;i<2;i++)
{
for(j=0;j<3;j++)
{
System.out.println(a[i][j]);
}
}
}
}
}