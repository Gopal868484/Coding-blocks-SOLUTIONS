import java.util.*;
public class Main {


    private static void allindices(int[] arr ,int m, int n ,int ci){
        if (ci==n){
            return;
        }
        if (arr[ci]==m){
            System.out.print(ci+" ");
        }
        allindices(arr,m,n,ci+1);
        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]  = new int[n];
        for(int i=0; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        int m = sc.nextInt();

        allindices(arr,m,n,0);

    }
}
