import java.util.*;
class Addmatrix
{
public static void main(String[]args)
{
int i,j,n,m;
Scanner s=new Scanner(System.in);

System.out.println("Enter the number of rows and columns of matrix");
    m = s.nextInt();
    n = s.nextInt();

    int a[][] = new int[m][n];
    int b[][] = new int[m][n];
    int sum[][] = new int[m][n];
System.out.println("enter elements of first array:");
for( i=0;i<m;i++)
{
 for(j=0;j<n;j++)
{
  a[i][j]=s.nextInt( );
}
}
System.out.println("enter elements of second array:");
{
for( i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
b[i][j]=s.nextInt( );
}
}
}
System.out.println("matrix addition");
{
 for (i= 0; i < m; i++)
{
      for (j= 0; j < n; j++)
{  
      sum[i][j] = a[i][j] + b[i][j];
}
}
}
System.out.println( "  product is ");
{
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.println(sum[i][j]+" ");
}
}
}
}
}