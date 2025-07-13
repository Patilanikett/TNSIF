public class RunnableDemo {

	public static void main(String[] args) {
	
		Runnable r=new UsingRunnable(10, 1, "hii");
		
		Thread t1=new Thread(r);
		t1.start();
	}}