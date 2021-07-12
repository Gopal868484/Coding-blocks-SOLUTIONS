import java.util.*;
public class Main {
    private static void endx(String str, int ci, int len){
        if (ci>=len){
            return;
        }
        char mychar= str.charAt(ci);
        if (mychar != 'x'){
            System.out.print(mychar);
        }
        endx(str,ci+1,len);
        if(mychar=='x'){
            System.out.print(mychar);
        }
    return;


    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        endx(str,0,str.length());

    }
}
