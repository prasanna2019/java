class Fibonacci
{
public static void main(String args[])
{
int n1=0;
int n2=1;
int n3;
System.out.print(n1+ "\t");
System.out.print(n2+ "\t");
 for(int i=1; i<=50; i++)
 { 
  n3= n1+n2;
  n1=n2;
  n2=n3;
  System.out.print(n3+ "\t");
 } 
}
}