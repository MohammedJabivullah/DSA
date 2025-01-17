package Questions;
import java.util.Scanner;

public class EvenNum {

//  7) Write a program to print all even numbers from input array A of size N.
//     Take integer N and N elements of the array as input from user.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        int i = 0;
        while(i<N){
            A[i] = sc.nextInt();
            i++;
        }

        i = 0;
        while(i<N){
            if(A[i]%2==0){
                System.out.print(A[i]+" ");
            }
            i++;
        }
    }
}
