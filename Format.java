public class Format {
   public static void main(String args[]) {
      float floatvar = 2.4f;
      int intVar = 10;
      String stringVar = "HINDUSTAN";
      System.out.printf(
            "The value of the float variable is = %f,while the value of the integer variable is =%d,and the string is=%s",
            floatvar, intVar, stringVar);

      String fs = String.format(
            "The value of the float variable is = %f,while the value of the inetger id = %d, and the string value is =%s",
            floatvar, intVar, stringVar);
      System.out.println(" ");
      System.out.println(fs);
   }
}