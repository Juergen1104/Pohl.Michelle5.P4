public class Overload {
   
    public static String concat(String s1, String s2) {
        return s1 + s2;
    }

    

    // 1.5
    public static void main(String[] args) {
        String s1 = "a", s2 = "b", s3 = "c";
        char c = '-';


        // abcabcabc
        System.out.println();
        
         // abbccc
        System.out.println();
        
         // aaa-bbb-ccc                         
        System.out.println();

   }
    
}
