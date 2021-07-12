import java.util.*;
public class Main {
    private static void genParantheses(String myans, int ob, int cb, int n){
        if (ob==n && cb==n){
            System.out.println(myans);
            return;

        }
         if(ob>cb){
            genParantheses(myans+')', ob, cb+1, n);
        }

        if(ob<n){
            genParantheses(myans+'(', ob+1, cb, n);
        }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        genParantheses("",0,0,n);
    }
}
