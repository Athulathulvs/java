import java.util.*;
class Calculator
{
public static void main(String[] args)
{
 int a,b,r,ch;
 Scanner s1=new Scanner(System.in);
 System.out.println("Enter two numbers :");
 a=s1.nextInt();
 b=s1.nextInt();
 System.out.println("Choose your Option :\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
 ch=s1.nextInt();
 switch(ch)
  {
   case 1:r=a+b;
   System.out.println(r);
   break;
   case 2:r=a-b;
   System.out.println(r);
   break;
   case 3:r=a*b;
   System.out.println(r);
   break;
   case 4:r=a/b;
   System.out.println(r);
   break;
   default:System.out.println("Invalid Choice!");
   break;
  }
}
}
