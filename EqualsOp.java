public class EqualsOp{
	public static void main(String... args){
		EqualsOp o1=new EqualsOp();
		EqualsOp o2=new EqualsOp();
		//Objcet equals compre reference id of objects.
		boolean b=o1.equals(o2);
		System.out.println(b);
		EqualsOp o4=new EqualsOp();
		EqualsOp o3=new EqualsOp();
		o3=o4;
		boolean b1=o4.equals(o3);
		System.out.println(b1);
	}
}