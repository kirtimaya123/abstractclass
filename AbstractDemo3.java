abstract class X {
 	int data ;
	X(int data) {
		this.data = data ;
		}
	public abstract int getData() ;
	}
public class AbstractDemo3 extends X {
	AbstractDemo3() {
		super(12);
		}
	@Override
	public int getData() {
		return data ;
		}
	public static void main(String args[]) {
	AbstractDemo3 aa = new AbstractDemo3() ;
	System.out.println("data value for the object is :"+aa.getData());
	}	
}