import java.util.Scanner;
class Calculator
{
 public static void main(String args[])
{
int a=4;
int b=8;
int n=0;
Scanner sc=new Scanner(System.in);
do{
  System.out.println("Addition: 1, Subtraction:2, Multiplication 3, Division 4, Modulus 5, Exit 0");
   n = sc.nextInt();
   switch(n)
{
case 1:
 System.out.println("Addition is"+(a+b));
break;

case 2:
 System.out.println("Subtraction is"+(a-b));
break;
case 3:
 System.out.println("Multiplication  is"+(a*b));
break;
case 4:
 System.out.println("Division  is"+(a/b));
break;
case 5:
 System.out.println("Modulus  is"+(a/b));
break;

default:
 System.out.println("Exit");
}
}
while(n!= 0);
}
}