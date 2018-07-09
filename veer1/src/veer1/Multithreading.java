package veer1;

public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread Thread1 = new Thread("veeresh");
        Thread Thread2 = new Thread("shetty");
        Thread1.start();
        Thread2.start();
        System.out.println("Thread names are following:");
        System.out.println(Thread1.getName());
        System.out.println(Thread2.getPriority());
        System.out.println(Thread1.getClass());
        System.out.println(Thread1.getState());

	}
	public void run()
	{
		try {
		    
		   } catch (Exception e) {
		    System.out.println("Thread has been interrupted");
		   }
	}

}
