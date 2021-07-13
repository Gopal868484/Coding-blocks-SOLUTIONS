import java.util.*;
public class Main {
    static int count = 0;
    private static void subseq(String s, String ans, int ci){
        if(ci==s.length()){
            System.out.print(ans+" ");
            count++;
            return;
        }
        subseq(s, ans, ci + 1);
        subseq(s, ans + s.charAt(ci), ci + 1);
        subseq(s, ans + (int)s.charAt(ci), ci + 1); 
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        subseq(s,"",0);
        System.out.println();
        System.out.println(count);
    }
}
