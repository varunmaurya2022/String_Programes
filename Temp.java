public class Temp{
	public static void main(String... args){
		String s=new String("Hello");
		//System.out.println(s.length); // Array of property which is tells the size of array. Here we can't use.
		System.out.println(s.length()); //Its methods of an array which is tells the total number of character in array.
		System.out.println("Varun!");
		System.out.println("Varun!".length());
		System.out.println(s);
		String s2=s.intern();
		System.out.println(s2);
		
		
	}
}