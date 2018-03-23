import java.util.Scanner;

class Prime
{
 public static void main(String args[])
{ 
  System.out.println("Type a number");
  Scanner sc=new Scanner(System.in);
  int n = sc.nextInt();
  
  for(int i=2;i<8;i++)
  {
   if(n%i==0)
   {
     System.out.println("Not a prime number");
     
     break;
   }
   else{
     System.out.println("This is a prime number");
     break;
   }
  }
}
}