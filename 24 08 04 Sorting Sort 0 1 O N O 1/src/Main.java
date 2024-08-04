import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for(int i = 0 ; i < n; i++){A[i] = sc.nextInt();}



        int[] sortedArray = solve(A);
        for(int num : sortedArray){
            System.out.print(num + " ");
        }
        System.out.println();


    }
    public static int[] solve(int[] A){
        int left = 0;
        int right = A.length -1;

        while(left < right){
            while(left < right && A[left] == 0){
                left++;
            }
            while(left < right && A[right]==1){right--;}
            if(left < right){
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
                left++;
                right--;
            }
        }
        return A;

    }

}