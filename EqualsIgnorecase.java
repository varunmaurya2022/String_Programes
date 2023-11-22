public class EqualsIgnorecase{
	public static void main(String args[]){
	String s1=new String("This is really not immutable!!");
	String s2=s1;
	String s3=new String("This is really not immutable!!");
	String s4=new String("THIS IS REALLY NOT IMMUTABLE!!");
	boolean res;
	res=s1.equals(s2);
	System.out.println(res);
	
	res=s1.equals(s3);
	System.out.println(res);
	
	res=s1.equalsIgnoreCase(s4);
	System.out.println(res);
	
	}
}