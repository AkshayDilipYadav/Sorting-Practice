import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];

        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }

        int[] result = getSmallerNumber(A);

        System.out.println(Arrays.toString(result));

    }

    public static int[] getSmallerNumber(int[] A){
        int[] count = new int[10];
        for(int num : A){
            count[num]++;
        }

        int index = 0;
        int[] result = new int[A.length];

        for(int digit = 0; digit < 10; digit++){
            while(count[digit] > 0){
                result[index++] = digit;
                count[digit]--;
            }
        }
return result;
    }

}