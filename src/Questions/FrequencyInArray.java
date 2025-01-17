package Questions;
import java.util.Scanner;

public class FrequencyInArray {

//  12) Given an integer array A.
//      Find and return the frequency of number B in array A.

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


        //finding Frequency of B in array A
        int f = 0;
        System.out.println("Enter ");
        int B = sc.nextInt();
        i = 0;
        while(i<N){
            if(A[i]==B){
                f++;
            }
            i++;
        }
        System.out.println("Frequency of "+B+" is :"+f);
    }
}
