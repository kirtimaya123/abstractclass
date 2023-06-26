abstract class X {
	public abstract void show() ;
	public abstract void call() ;
	public abstract void fall() ;
	}
abstract class Y extends X {
        @Override
	public void show() {
  		System.out.println("Hello lulu.");
	}
}
abstract clas Z extends Y {
 	@Override
	public void fall() {
		System.out.println("Are you in the class.");
	}
}
public class AbstractDemo2 extends Z {
	@override
	public void call() {
  		System.out.println("Are you free in 3pm.");
	}
}
public static void main(String args[]) {
	AbstractDemo2 aa = new AbstractDemo2() ;
	aa.show();
	aa.fall();
	aa.call();
	}
}
