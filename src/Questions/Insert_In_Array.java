package Questions;
import java.util.Scanner;

public class Insert_In_Array {
//    17) Write a program to input N numbers array,
//        a number X and a number Y from user and
//        insert an element Y in it at specified position X.

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


        //insertion
        System.out.print("X: ");
        int X = sc.nextInt();
        System.out.print("Y: ");
        int Y = sc.nextInt();

        int[] B = new int[A.length+1];

        int j = 0;
        for(int i=0;i<B.length;i++){
            if(i==X){
                B[i] = Y;
            }
            else{
                B[i] = A[j];
                j++;
            }
        }

        o = 0;
        while(o<B.length){
            System.out.print(B[o]+" ");
            o++;
        }

    }
}
