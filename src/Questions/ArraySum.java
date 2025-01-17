package Questions;
import java.util.Scanner;

public class ArraySum {

//  3)Write a program to print sum of elements of the input array A of size N.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // we are taking array size from user N
        int N = sc.nextInt();
        int S[] = new int[N];

        //Sum of Array Elements
        int i = 0;
        int Sum = 0;
        while (i < N) {
            S[i] = sc.nextInt();
            i++;
        }
        i = 0;
        while(i<S.length){
            Sum = Sum + S[i];
            i++;
        }
        System.out.println("Sum "+Sum);
    }
}
