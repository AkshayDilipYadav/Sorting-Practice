import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for(int i = 0 ; i < n; i++){A[i] = sc.nextInt();}



        int invCount = solve(A);
        {System.out.print(invCount + " ");}
        System.out.println();


    }
    private static final int MOD = 1000000007;

    public static int solve(int[] A) {
        int[] temp = new int[A.length];
        return mergeSortAndCount(A, temp, 0, A.length -1);
    }

    private static int mergeSortAndCount(int[] A, int[] temp, int left, int right){
        int mid, invCount = 0;
        if(right > left){
            mid = (right + left)/ 2;

            invCount = (invCount + mergeSortAndCount(A, temp, left, mid))% MOD;
            invCount = (invCount + mergeSortAndCount(A, temp, mid + 1, right))%MOD;

            invCount = (invCount + mergeAndCount(A, temp, left, mid + 1, right))% MOD;
        }
        return invCount;
    }

    private static int mergeAndCount(int[] A, int[] temp, int left, int mid, int right){
        int i, j, k;
        int invCount = 0;
        i = left;
        j = mid;
        k = left;

        while((i <= mid - 1)&&(j <= right)){
            if(A[i] <= A[j]){temp[k++] = A[i++];}
            else{
                temp[k++] = A[j++];
                invCount = (invCount + (mid - i))% MOD;
            }
        }

        while(i <= mid - 1){temp[k++] = A[i++];}
        while(j <= right){temp[k++] = A[j++];}
        for(i = left; i <= right; i++){A[i] = temp[i];}
        return invCount;

    }


}