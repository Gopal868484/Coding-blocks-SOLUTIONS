import java.util.*;
public class Main {
    private static void duplicate(String s, int ci){
        if (ci==s.length()-1){
            System.out.println(s.charAt(ci));
            return;
        }
        if (s.charAt(ci)==s.charAt(ci+1)){
            System.out.print(s.charAt(ci)+"*");
            duplicate(s, ci+1);
        }
        else{
            System.out.print(s.charAt(ci));
            duplicate(s, ci+1);

        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        duplicate(s,0);

    }
}
