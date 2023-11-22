public class GetByte{
	public static void main(String... args){
		String s="abcde";
		byte b[]=s.getBytes();
		for (int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		for (int j=0; j<s.length();j++){
			char ch=s.charAt(j);
			System.out.print(ch+" ");
		}
		String s3=new String(s);
		System.out.println(s3);
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
	}
}