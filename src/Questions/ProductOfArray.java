package Questions;
import java.util.Scanner;

public class ProductOfArray {

//  4) Write a program to print product of elements of the input array A of size N.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // we are taking array size from user N
        int N = sc.nextInt();
        int[] S = new int[N];

        //Taking input from user
        int i = 0;
        int Sum = 0;
        while (i < N) {
            S[i] = sc.nextInt();
            i++;
        }

        // Printing product of array
        i = 1;
        int Pro = S[0];
        while (i < S.length) {
            Pro = Pro * S[i];
            i++;
        }
        System.out.println("Product " + Pro);
    }
}
