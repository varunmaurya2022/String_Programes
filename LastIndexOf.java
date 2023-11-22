public class LastIndexOf {
   public static void main(String... args) {
      String s1 = new String("Welcome zto Tutorials");
      String s2 = new String("Tutorials");
      String s3 = new String("Sutorials");

      System.out.print("Found Last Index ");
      System.out.println(s1.lastIndexOf('o'));
      System.out.print("Found Last Index ");
      System.out.println(s1.lastIndexOf('o', 10));
      System.out.print("Found Last Index ");
      System.out.println(s1.lastIndexOf(s2, 15));
      System.out.print("Found Last Index ");
      System.out.println(s1.lastIndexOf(s3));

   }
}
