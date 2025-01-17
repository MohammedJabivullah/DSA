package Questions;
import java.util.Scanner;

public class MaxMin {

//  5)Write a program to find max and min in array A of size N.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // we are taking array size from user N
        int N = sc.nextInt();
        int S[] = new int[N];

        //Sum of Array Elements
        int i = 0;
        int Sum = 0;
        while(i<N){
            S[i] = sc.nextInt();
            i++;
        }
        i = 1;
        int max = S[0];
        int min = S[0];
        while(i<S.length){
            if(max<S[i]){
                max = S[i];
            }
            if(min>S[i]){
                min = S[i];
            }
            i++;
        }
        System.out.println("Max "+max);
        System.out.println("Min "+min);
    }
}
