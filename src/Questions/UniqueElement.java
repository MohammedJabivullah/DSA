package Questions;
import java.util.Scanner;

public class UniqueElement {
//  16) Given an Array of integers A, every element in it is repeated twice except one,
//      find that unique element.

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



        //Finding Unique element
        for (int i=0;i<A.length;i++) {
            int C = 0;
            for (int j=0;j<A.length;j++) {
                if (A[i] == A[j]) {
                    C++;
                }
            }
            if(C==1){
                System.out.println(A[i]);
                break;
            }
        }
    }
}
