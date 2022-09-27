import java.util.Scanner;

class Calculator
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("please enter values opf n1");
  int n1=s.nextInt();
  System.out.println("please enter values of n2");
  int n2=s.nextInt();
  System.out.println("addition-0;subtraction-1;multiplication-2;division-3");
  int op=s.nextInt();
  
  if(op==0)
  {
   System.out.println("sum" +" "+(n1+n2));
   }
   }
   }
