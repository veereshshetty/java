package veer1;

class override
{
	public void display(String msg){
		System.out.println(msg);
	}
}
public class Default_Annotations extends override
{
	
	//Override example
	@Override
	public void display(String msg){
		System.out.println("Message is: "+ msg);
	}
	public static void main(String args[]){
		Default_Annotations obj = new Default_Annotations();
		obj.display("Hey veeresh!!");
	}
	
	//Depricated example
	@Deprecated
    public void add() {
        // old method
		int a=1;
		int b=2;
		int c;
		c= a+b;
		System.out.println("sum"+c);
    }
 
    public void addition() {
        // new, alternate method
    	int a=1,b=2;
    	
    	System.out.println("sum is"+(a+b)); 	
    	
    } 
    
  //@SuppressWarnings example
    @SuppressWarnings("deprecation")
    public void supress() {
    	Default_Annotations obj = new Default_Annotations();
        obj.add();  // this is a deprecated method
    }
}