package Questions;

public class CopyArray {

//  10) Write a program to copy all the elements of the array to another array.

    public static void main(String[] args) {
        char[] C = {'H','E','L','L','O'};
        char[] C1 = new char[C.length];

        int i = 0;
        while(i<C.length){
            C1[i]=C[i];
            i++;
        }

        i = 0;
        while(i<C1.length){
            System.out.print(C1[i]+" ");
            i++;
        }
    }
}
