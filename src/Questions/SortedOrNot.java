package Questions;
import java.util.Scanner;

public class SortedOrNot {
//    16) Given an array A,
//        check if it is sorted in non-decreasing order or not.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Array size: ");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Array: ");
        int o = 0;
        while(o<N){
            A[o] = sc.nextInt();
            o++;
        }

        // Sorted or not
        for(int i=0;i<A.length-1;i++){
            if(A[i]>A[i+1]){
                System.out.println("Not Sorted");
                break;
            }
            else if(i == A.length-2){
                System.out.println("Sorted");
            }
        }
    }
}
