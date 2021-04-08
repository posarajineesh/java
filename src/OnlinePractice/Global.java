package OnlinePractice;

public class Global {
int a=20;
int b=10;
int c;
void add()
{
	c=a+b;
	System.out.println();	
}
 void sub()
 {
 c=a-b;
 System.out.println();
}

public static void main (String[] args){;
Global n=new Global();
n.add();
n.sub();
}
}
