package Questions;
import java.util.Scanner;

public class Delete_In_Array {
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

        //Deletion
        System.out.print("X: ");
        int X = sc.nextInt();

        int[] B = new int[A.length-1];

        int j = 0;
        for(int i=0;i<B.length;i++){
            if(j==X){
                j++;
            }
            B[i] = A[j];
            j++;
        }

        o = 0;
        while(o<B.length){
            System.out.print(B[o]+" ");
            o++;
        }
    }
}
