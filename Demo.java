public abstract class Demo {
	int data ;
	public abstract void setData (int data);
	public abstract int getData();
	void call() {
		System.out.println("Magic of java.");
		}
	public static void main(String args[]) {
		Demo dd = new Demo ()
			{
			@Override
			public void setData(int X) {
				data = 	X ;
			}
			@Override
			public int getData() {
				return data;
				}
			};
		dd.call();
		dd.setData(56);
		System.out.println("Data for the object is :"+dd.getData()) ;
		}	
}
				