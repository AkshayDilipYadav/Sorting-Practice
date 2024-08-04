import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for(int i = 0 ; i < n; i++){A[i] = sc.nextInt();}



        int[] sortedArray = solve(A);
        for(int num : sortedArray){System.out.print(num + " ");}
        System.out.println();


    }

    public static int[] solve(int[] A){
        if(A.length <= 1){return A;}
        mergeSort(A, 0, A.length -1);
        return A;
    }

    public static void mergeSort(int[] array, int left, int right){
        if(left < right){
            int mid = left + (right - left)/ 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid +1, right);
            merge(array, left, mid, right);
        }
    }
    private static void merge(int[] array, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0; i < n1; ++i){L[i] = array[left + i];}
        for(int j = 0; j < n2; ++j){R[j] = array[mid + 1+ j];}
        int i =0, j =0;
        int k = left;

        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                array[k] = L[i];
                i++;
            }
            else{
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            array[k++] = L[i++];
        }
        while(j < n2){array[k++] = R[j++];}


    }

}