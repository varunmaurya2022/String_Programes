public class ConvertChar{
	public static void main(String... args){
		
		//String(char c[] ,int position,intnumberofelements)
		char ch[]={'A','p','p','s','q','u','a','d','z'};
		String s1=new String (ch);
		System.out.println(s1);
		
		//The valueOf method is a static method of the strig class that is also  used  to convert char[] array to string.
		char chars[]={'c','o','d','e','s','q','u','d','z'};
		String str=new String();
		String string=str.valueOf(chars);
		System.out.println(string);
		
		//The copuValueOf is a static method that is also use to convert char[] array to String.
		char char1[]={'c','o','d','e','s','q','u','d','z'};
		String str1=new String();
		String string1=str1.copyValueOf(char1);
		System.out.println(string1);	
	} 
}