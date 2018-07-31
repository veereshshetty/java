package veer1;

public class Default_Methods implements Cloneable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Default_Methods obj = new Default_Methods();

		// prints the object value in string form
		System.out.println(obj.toString());

		// prints the class name with package
		System.out.println(obj.getClass());

		// prints the hashcode of a object

		System.out.println(obj.hashCode());

		// prints true or false by comparing two strings
		String s1 = new String("veeresh");
		String s2 = new String("veeresh");
		System.out.println(s1.equals(s2));

		// cloning the object of the same type
		Default_Methods clonedobject = (Default_Methods) obj.clone();
		System.out.println(clonedobject);
		
		obj = null;
		System.gc();
		
		
	}
	
	public void finalize()
	{
	    System.out.println("Destroyed");
	}


}
