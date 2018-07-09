package veer1;

public class Multithreading_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multithreading1 t1=new multithreading1();  
		multithreading1 t2=new multithreading1();  
		multithreading1 t3=new multithreading1();  
		 t1.start();  
		 try{  
		  t1.join();  
		 }catch(Exception e){System.out.println(e);}  
		  
		 t2.start();  
		 t3.start();  
		 }  

	}
	class multithreading1 extends Thread{
	public void run(){  
		  for(int i=1;i<=5;i++){  
		   try{  
		    Thread.sleep(500);  
		   }catch(Exception e){System.out.println(e);}  
		  System.out.println(i);  
		  }  
		 }  
	}


