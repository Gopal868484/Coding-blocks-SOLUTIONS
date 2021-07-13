import java.util.*;
public class Main {

    private static int firstIndex(int[] arr,int ci,int m,int n ){
        if (ci==n){
            return -1;
        }
        if (arr[ci]==m){
            return ci;
        }

         int myrec=firstIndex(arr,ci+1,m,n);
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
            System.out.println(firstIndex(arr,0,m,n));
    }
}
