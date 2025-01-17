package Questions;

public class PrintCharArray {

//     2) Print all elements in Array of characters of size 6

    public static void main(String[] args) {

        char C[] = {'H', 'E', 'L', 'L', 'O','!'};

        int i = 0;
        int leng = C.length;
        while (i < leng) {
            System.out.print(C[i]);
            i++;
        }
    }
}
