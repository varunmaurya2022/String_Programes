public class Intern {
   public static void main(String args[]) {
      String s1 = new String("Welcome To Tutorials");
      String s2 = new String("WELCOME TO TUTORIALS OF STRING");

      System.out.print("Canonical repsentation ");
      System.out.println(s1.intern());
      
      System.out.print("Canonical repsentation ");
      System.out.println(s2.intern());
   }
}
