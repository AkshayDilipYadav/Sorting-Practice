import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){A[i] = sc.nextInt();}

        int m = sc.nextInt();
        int[] B = new int[m];
        for(int i = 0; i < m; i++){B[i] = sc.nextInt();}

      int[] result = mergeSortedArray(A, B);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeSortedArray(int[] A, int[] B){
        int n = A.length;
        int m = B.length;

        int[] result = new int[n+m];
        int i = 0, j = 0, k = 0;
        while(i < n && j < m){
            if(A[i] <= B[j]){result[k++] = A[i++];}
            else{result[k++] = B[j++];}
        }

        while(i < n){
            result[k++] = A[i++];
        }

        while(j < m){result[k++] = B[j++];}
        return result;


    }

}
