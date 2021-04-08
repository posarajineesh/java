package OnlinePractice;

public class Double {
	double a=20.01;
	double b=24.22;
	double c;
	public void mul()
	{
	double c=a*b;
	System.out.println(c);
	}
	public void div()
	{
	double c=a/b;
	System.out.println(c);
	}
	public static void main (String[]args)
	{
		Double d=new Double();
		d.mul();
		d.div();
	}
	}


