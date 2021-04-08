package OnlinePractice;

import java.util.Scanner;

public class Task {
	int a,b,c;
	Scanner s=new Scanner(System.in);
	public void add()
	{
		System.out.println("enter first number");
		a=s.nextInt();
		System.out.println("enter second number");
		b=s.nextInt();
		c=a+b;
		System.out.println("Addition is :"+c);
		if(c%2==0)
		{
			System.out.println("number is even"+c);
		}
		else
			
		{
			System.out.println("number is odd"+c);
		}
		
	}
	public void sub()
	{
		System.out.println("enter first number:");
		a=s.nextInt();
		System.out.println("enter second number:");
		b=s.nextInt();
		c=a-b;
		System.out.println("Subsraction is:"+c);
		if(c%2==0)
		{
			System.out.println("number is even :"+c);
		}
		else
		{
			System.out.println("number is odd :"+c);
		}
			
			
	}
	public void mul ()
	{
		System.out.println("enter first number");
		a=s.nextInt();
		System.out.println("enter second number");
		b=s.nextInt();
		c=a*b;
		System.out.println("mul is :"+c);
		if(c%2==0)
		{
			System.out.println("number is even :"+c);
		}
		else
		{
			System.out.println("number is odd :"+c);
		}
			
	}
	public void div()

	{
		System.out.println("enter first number");
		a=s.nextInt();
		System.out.println("enter second number");
		b=s.nextInt();
		c=a/b;
		System.out.println("div is :"+c);
		if(c%2==0)
		{
			System.out.println("number is even :"+c);
		}
		else
		{
			System.out.println("number is odd :"+c);
		}
			
	}
	public static void main(String[]args) {;
	ScannerPract v=new ScannerPract();
	v.add();
	v.sub();
	v.mul();
	v.div();


				
	}
	}
