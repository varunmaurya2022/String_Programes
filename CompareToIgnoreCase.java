public class CompareToIgnoreCase{
	public static void main(String... args){
		String s1="String are immutable";
		String s2="string are immutable";
		String s3="Intgeres are not immutable!";
		
		int result=s1.compareTo(s2);
		System.out.println("CompareTo "+result);
		
		result=s1.compareToIgnoreCase(s2);
		System.out.println("CompareToIgnoreCase "+result);
		
		result =s1.compareToIgnoreCase(s3);
		System.out.println(result);
	}
}