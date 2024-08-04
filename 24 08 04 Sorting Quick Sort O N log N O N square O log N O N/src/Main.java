import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for(int i = 0 ; i < n; i++){A[i] = sc.nextInt();}



        solve(A, 0, A.length - 1);
        for(int num : A){
            System.out.print(num + " ");
        }
        System.out.println();


    }
    public static void solve(int[] A, int low, int high){
        if(low < high){
            int pivotIndex = partition(A, low, high);
            solve(A, low, pivotIndex - 1);
            solve(A, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] A, int low, int high){
        int pivot = A[high];
        int i = low - 1;

        for(int j = low; j < high; j++){
            if(A[j] <= pivot){
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i + 1];
        A[i + 1] = A[high];
        A[high] = temp;
        return i + 1;
    }



}