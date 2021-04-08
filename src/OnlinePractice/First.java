package OnlinePractice;

public class First {
	int a=10;
	int b=20;
	int c;
	
	void add1()//method
	{
		c=a+b;
		System.out.println(c);
		
	}
	void sub()//method
	{
		c=a-b;
		System.out.println(c);
	}
	void mul()
	{
		c=a*b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {//main method
		First f=new First();//object
		f.add1();
		f.mul();
		f.add1();
		
		
	}

}
