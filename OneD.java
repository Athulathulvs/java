import java.util.*;
class OneD
{
public static void main(String[] args)
{
int a[]=new int[5];
int i;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the numbers :");
for(i=0;i<5;i++)
{
a[i]=s1.nextInt();
}
for(i=0;i<5;i++)
System.out.println("Array is :"+a[i]);
}}
