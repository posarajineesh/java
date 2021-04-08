package OnlinePractice;

public class Practices {
int a=10;
int b=10;
int c;
public void add ()
{
	c=a*b;
	System.out.println(c);
}
public void sub ()
{
	c=a-b;
	System.out.println(c);
}
public static void main(String[] args) {
	Practices f=new Practices();
	f.add();
	f.sub();
}
}
