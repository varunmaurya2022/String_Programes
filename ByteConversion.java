public class ByteConversion{
	public static void main(String... args){
		byte b[]={65,66,67,68,69};
		String s=new String(b);
		System.out.println(s);
		String s1=new String(b,2,3);
		System.out.println(s1);
	}
}