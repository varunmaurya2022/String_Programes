public class CharAt{
	public static void main(String... args){
		String s1="hello";
		int count=0;
		for (int i=0;i<s1.length();i++){
			char ch=s1.charAt(i);
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
				count+=1;
				System.out.print(ch);	
			}
			
		}
		System.out.println("");
		System.out.println("total count "+count);
	}
}