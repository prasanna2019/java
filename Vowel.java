import java.util.Scanner;
class Vowel
{
 public static void main(String args[])
{ 
  System.out.println("Enter a character");
  Scanner sc=new Scanner(System.in);
  char n = sc.next(".").charAt(0);
  switch(n)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
System.out.print("This is a vowel");
break;
default:
System.out.print("This is not a vowel");
}
}
}