abstract class X {
	void call() {
		System.out.println("object method.");
	}
	static void show() {
		System.out.println("class method.");
	}
	String name;
        X() {
		System.out.println("object is constructed.");
		}
	public abstract void setName(String name);
	public abstract String getName();
	
       }
 class AbstractDemo extends X {
	@Override
	public void setName(String name) {
		this.name = name ;
			}
	@Override
	public String getName() {
		return name;
		}
	public static void main(String args[]) {
		X aa = new AbstractDemo() ;
		aa.call();
		aa.setName("java Technocart.");
		System.out.println("Name is : "+aa.getName()) ;
		aa.show();
	}
}