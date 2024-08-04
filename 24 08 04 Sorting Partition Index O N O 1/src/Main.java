import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for(int i = 0 ; i < n; i++){A[i] = sc.nextInt();}



        solve(A);
        for(int num : A){
            System.out.print(num + " ");
        }
        System.out.println();


    }
    public static int solve(int[] A){
        int n = A.length;
        int pivot = A[n-1];
        int i = -1;
        for(int j = 0; j < n - 1; j++){
            if(A[j] < pivot){
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i+1];
        A[i+ 1] = A[n -1];
        A[n- 1] = temp;
        return i + 1;
    }

}