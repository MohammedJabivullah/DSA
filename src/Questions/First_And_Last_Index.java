package Questions;
import java.util.Scanner;

public class First_And_Last_Index {
//  13) It is guaranteed that B exists in A.
//      Return an array C of size 2,
//      where C[0] is the first index of B in A and C[1] is the last index of B in A.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of elements in array: ");
        int N = sc.nextInt();
        int[] A = new int[N];

        System.out.println("Enter array elements: ");

        // inserting array A
        int i = 0;
        while(i<N) {
            A[i] = sc.nextInt();
            i++;
        }

        // finding first and least index of B in array A

        int[] C = {-1,-1};
        System.out.println("Enter B: ");
        int B = sc.nextInt();

        i = 0;
        while(i<A.length){
            if(A[i]==B){
                C[0] = i;
                C[1] = i;
                break;
            }
            i++;
        }

        i = A.length-1;
        while(i>C[1]){
            if(A[i]==B){
                C[1] = i;
                break;
            }
            i--;
        }
        System.out.println("First index is "+C[0]+" and Least index is "+C[1]);
    }
}
