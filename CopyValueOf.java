public class CopyValueOf{
	public static void main(String... args){
		char s1[]={'h','e','l','l','o','w','o','r','d'};
		String s2="";
		
		s2=String.copyValueOf(s1);
		System.out.println("Returned String "+s2);
		//print from 2nd postion 5 element.
		s2=String.copyValueOf(s1,2,5);
		System.out.println("Returned String "+s2);
	}
}