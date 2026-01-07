package Array;

//Question:Given N array elementes & Q queries on same array
//for each query calculate sum of all elements in given range - [L, R](L & R are indices such that L <= R)

public class Q1 {

    public int[] rangeSum(int []A, int [][]B){

        // Using PrefixSum
        int []arrPrefix = new int[A.length];
        for(int i=0;i<A.length;i++){
            if(i != 0){
                arrPrefix[i] = arrPrefix[i-1] + A[i];
            }else{
                arrPrefix[i] = A[i];
            }
        }

        int []sum = new int[B.length];

        for(int i= 0; i<B.length;i++){
            if(B[i][0] > 0 ){
                sum[i] = arrPrefix[B[i][1]]-arrPrefix[(B[i][0])-1];
            }else{
                sum[i] = arrPrefix[B[i][1]];
            }
        }

        return sum;

    }

    public static void main(String[] args) {
        int []A = {1, 2, 3, 4, 5};
        int [][]B = {{0, 3},{1, 2}, {0, 0}};

        Q1 a = new Q1();
        int []ans = a.rangeSum(A, B);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+", ");
        }
    }


}