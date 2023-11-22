public class PositionConvertChar{
	public static void main(String... args){
		char ch[]={'A','p','p','s','q','u','a','d','z'};
		
		String s=new String(ch,2,3);
		System.out.println(s);
		
		char chars[]={'H','e','l','l','o'};
		//Question
		String str=new String();
		String string=str.valueOf(chars,2,3);
		System.out.println(string);
	}
}