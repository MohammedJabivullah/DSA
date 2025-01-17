package Questions;
import java.util.Scanner;

public class SearchInArray {
//  11) You are given an integer T (number of test cases).
//      You are given array A and an integer B for each test case.
//      You have to tell whether B is present in array A or not.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of Test cases: ");
        int T = sc.nextInt();

        // Running N Test cases
        int I = 1;
        while(0<T){

            System.out.println("Test case "+I);
            I++;
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

            System.out.println("Enter element to search: ");

            // Searching integer B
            int B = sc.nextInt();
            i = 0;
            while(i<N){
                if(A[i]==B){
                    System.out.println("element "+B+" is present");
                    break;
                }
                else if(i==A.length-1){
                    System.out.println("element "+B+" is not present");
                }
                i++;
            }
            System.out.println();

            T--;
        }
    }
}
