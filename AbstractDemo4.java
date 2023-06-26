abstract class X {
  	public abstract void show() ;
	}
abstract class Y extends X {
	public abstract void display() ;
	}
public class AbstractDemo4 extends Y {
	@Override
	public void show() {
		System.out.println("Helo.");
	}
	@Override
	public void display() {
		System.out.println("Good morning.");
	}
	public static void main(String args[]) {
	X aa = new AbstractDemo4() ;
	aa.show();
	((Y)aa).display();
	}
}
	
