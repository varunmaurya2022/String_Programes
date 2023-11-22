/*public boolean endsWith(String suffix)*/
public class EndsWith{
	public static void main(String... args){
		String s1=new String("This is really not immutable!!");
		boolean retVal;
		
		retVal=s1.endsWith("immutable!!");
		System.out.println("Returned Value "+retVal);
		
		retVal=s1.endsWith("table");
		System.out.println("Returned Value "+retVal);
		
	}
}