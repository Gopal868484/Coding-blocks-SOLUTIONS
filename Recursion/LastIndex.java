import java.util.*;
public class Main {
    private static int lastIndex(int[] arr,int ci,int m){
        if (ci==-1){
            return -1;
        }
        if (arr[ci]==m){
            return ci;
        }

         int myrec=lastIndex(arr,ci-1,m);
         return myrec;


    }
    public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);    
            int n=sc.nextInt();  
            int[] arr= new int[n];  
            for(int i=0; i<n; i++) {
                arr[i]=sc.nextInt();  
            } 
            int m =sc.nextInt();
            System.out.println(lastIndex(arr,n-1,m));
    }
}
