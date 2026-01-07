package Array;

//Question 2: Given N array elements, count no of equilibrium index.
//An index is said to be equilibrium index if:
//sum of all elements left of iᵗʰ index (sum[0, i-1]) = sum of all elements Right of iᵗʰ index (sum[i+1, N-1])
// Note: if i == 0, leftSum = 0;
//      if i == N-1, rightSum = 0;

public class Q2 {

    public int countEquilibrium(int []arr){

        int n = arr.length;
        int []prefixSum = new int[n];
        prefixSum[0] = arr[0];

        for(int i=1; i<n; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        int count = 0;

        for(int i=0; i<n; i++){
            int leftSum, rightSum;
            if(i == 0){
                leftSum = 0;
            }else{
                leftSum = prefixSum[i-1]; //i-1 :- left index of current position
            }

            rightSum = prefixSum[n-1] -prefixSum[i];

            if(leftSum == rightSum){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int []arr = {-3, 2, 4, -1};
        // example tests //{-7,1,5,2,-4,3,0};
                        //{3,-1,2,-1,1,2,1};

        Q2 obj = new Q2();
        int count = obj.countEquilibrium(arr);

        System.out.println(count);
    }
}
