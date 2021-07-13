import java.util.*;
public class Main {
    private static String replace(String cc){
        if (cc.length()<=1){
            return cc;
        }

        if (cc.charAt(0) =='p' && cc.charAt(1)=='i'){
            return "3.14"+replace(cc.substring(2));
        }

        return cc.charAt(0)+replace(cc.substring(1));


    }
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        String lines[] = new String[n];
        sc.nextLine();

        for(int i= 0; i<n ; i++){
            lines[i] =sc.nextLine();
        }
        for (String cc : lines){
            System.out.println(replace(cc));
        }

    }
}
