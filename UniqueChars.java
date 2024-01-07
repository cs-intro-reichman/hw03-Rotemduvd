/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String str) {
        int i = 0;
        String ans = "" ;

        while (i < str.length()){
            char c = str.charAt(i);
        
            if (ans.indexOf(c) == -1 || c == ' '){
                ans = ans + c;
            }

            i++;

        }   
        return ans;
    }
}