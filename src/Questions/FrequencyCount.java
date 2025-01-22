package Questions;
import java.util.Scanner;

public class FrequencyCount {
//    15) You are given an integer array A,
//        you have to return an integer array of same size
//        whose ith element is the frequency count of A[i] in array A .

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Array size: ");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Array: ");
        // inserting array A
        int o = 0;
        while(o<N) {
            A[o] = sc.nextInt();
            o++;
        }



        //Frequency Count
        int[] B = new int[A.length];
        for(int i=0;i<A.length;i++){
            int count = 0;
            for (int j : A) {
                if (A[i] == j) {
                    count++;
                }
            }
            B[i] = count;
        }

        //print B
        o = 0;
        while(o<B.length){
            System.out.print(B[o]+" ");
            o++;
        }
    }
}
