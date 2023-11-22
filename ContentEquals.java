public class ContentEquals{
	public static void main(String... args){
		String s1="Not immutable";
		String s2="Strngs are immutable";
		StringBuffer s3=new StringBuffer("Not immutable");
		//compare content of string and stringbubber objects.
		boolean result=s1.contentEquals(s3);
		System.out.println(result);
		
		result=s2.contentEquals(s3);
		System.out.println(result);
	}
}