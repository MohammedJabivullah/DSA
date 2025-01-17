package Questions;
import java.util.Scanner;

public class EvenOddDifference {

//  9) Write a program to find the difference between the sum of all even elements
//     and the sum of all odd elements. Take integer N and N elements of the array as input from user.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        int i = 0;
        while(i<N){
            A[i] = sc.nextInt();
            i++;
        }

        int SE = 0;
        i = 0;
        while(i<N){
            if(A[i]%2==0){
                SE = SE+A[i];
            }
            i++;
        }

        int SO = 0;
        i = 0;
        while(i<N){
            if(A[i]%2!=0){
                SO = SO+A[i];
            }
            i++;
        }
        if(SE>SO){
            System.out.println(SE-SO);
        }
        else{
            System.out.println(SO-SE);
        }
    }
}
