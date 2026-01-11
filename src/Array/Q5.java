package Array;

// Question :Given an integer array A containing N distinct integers, you have to find all the leaders in array A.
//            An element is a leader if it is strictly greater than all the elements to its right side.
//            NOTE: The rightmost element is always a leader.

public class Q5 {

    public int countOfLeaders(int []a){

//      According to NOTE: The rightmost element is always a leader.
//        so the right most (first element from right) is always a leader
        int max = a[a.length-1];
        int count = 1;

        for(int i=a.length-2;i>=0;i--){
            if(max < a[i]){
                max = a[i];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int []a = {16, 17, 4, 3, 5, 2};
        // here 2, 5, 17 are leaders
        // Ex {10, -9, -4, 5,  -2} -> 10,5,-2
        //    {8, -2, 4, 7, 6, 5, 1} -> 8,7,6,5,1
        //    {15, -1, 7, 2, 5, 4, 2, 3} -> 15,7,5,4,3

        Q5 obj = new Q5();

        System.out.println(obj.countOfLeaders(a));

    }
}
