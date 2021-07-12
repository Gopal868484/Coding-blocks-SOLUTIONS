import java.util.*;
public class Main {
    private static int assignment(int n){
        if(n==1){
	            return 2;
        }
        if(n==2){
	        return 3;
        }
        else{
        return assignment(n-1)+assignment(n-2);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t ;i++){
            int n =sc.nextInt();
            System.out.println("#"+i+" "+":"+" "+assignment(n));


        }   

    }
}
