package OnlinePractice;

import java.util.Scanner;

public class ScannerPract {
int a,b,c;
Scanner s=new Scanner(System.in);
public void add ()
{
System.out.println("enter first number:");
a=s.nextInt();
System.out.println("enter second number:");
b=s.nextInt();
c=a+b;
System.out.println("Addition is:"+c);
}
public void sub ()
{
	System.out.println("enter first number:");
	a=s.nextInt();
	System.out.println("enter second number:");
	b=s.nextInt();
	c=a-b;
	System.out.println("Subsraction is:"+c);
}
public void mul ()
{
	System.out.println("enter first number");
	a=s.nextInt();
	System.out.println("enter second number");
	b=s.nextInt();
	c=a*b;
	System.out.println("mul is :"+c);
}
public void div()
{
	System.out.println("enter first number");
	a=s.nextInt();
	b=s.nextInt();
	c=a/b;
	System.out.println("div is :"+c);
}
public void m1()
{
	
}
public static void main(String[]args) {;
ScannerPract v=new ScannerPract();
v.add();
v.sub();
v.mul();
v.div();

			
}
}
