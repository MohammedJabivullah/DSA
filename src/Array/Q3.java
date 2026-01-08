package Array;

//Question 3: Given N array elements & Q queries containing L & R each.
//          Find no of even numbers in given range.

public class Q3 {

    public int[] findEven(int []arr, int [][]queries){

        //Creating a prefix Sum array which stores only even number count
        int []preSum = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                if(i>0){
                    preSum[i] = preSum[i - 1] + 1;
                }else {
                    preSum[i] = 1;
                }
            }else if(i>0){
                preSum[i] = preSum[i-1];
            }
            System.out.println(preSum[i]);
        }
        //
         // Finding no of even no by using preSum
        int []Q = new int[queries.length];

        for(int i=0; i<Q.length; i++){
            if(queries[i][0] > 0){  //queries[i][0] is L - queries[i][1] is R
                Q[i] = preSum[queries[i][1]] - preSum[queries[i][0]-1]; //R - (L-1)
            }else{
                Q[i] = preSum[queries[i][1]];
            }
        }

        return Q;
    }


    public static void main(String[] args) {
        int []arr = {2,4,3,7,9,8,6,5,4,9};

        //L < R condition
        int [][]queries = {{0,4},{4,8},{3,9}};

        Q3 obj = new Q3();

        int []ans = obj.findEven(arr, queries);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
