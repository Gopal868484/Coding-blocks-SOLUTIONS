import java.util.*;
public class Main {
    private static void conversion(String str,int ci){
        if (ci==str.length()){
            return;
        }
        char ch = str.charAt(ci);
        int a = Character.getNumericValue(ch);
        System.out.print(a);

        conversion(str,ci+1);

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        conversion(str,0);

    }
}
