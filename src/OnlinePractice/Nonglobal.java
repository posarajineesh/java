package OnlinePractice;

public class Nonglobal {
int a=10;
int b=10;
int c;
public void add ()
{
 int a=20;
 int b=30;
 int c=this.a+b;
 System.out.println(c);
}
public void sub ()
{
	int a=10;
	int b=10;
	int c=a-b;
	System.out.println(c);
}
public static void main (String[] args){;
Nonglobal n=new Nonglobal();
n.add();
n.sub();
}

}