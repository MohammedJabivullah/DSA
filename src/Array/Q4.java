package Array;


// Question 4:You have given a Array A having Uppercase English letters.
//            You have to find how many times subsequence "AG" is there in the given Array.
//            NOTE: Return the answer modulo 109 + 7 as the answer can be very large.

public class Q4 {

    public int subsequenceCount(char []a){
        long total = 0;
        int count = 0;

        for(int i=a.length-1;i>=0;i--){
            if(a[i]=='G'){
                count++;
            }else if(a[i]=='A'){
                total += count;
            }
        }

        return (int)(total%1000000007);
    }

    public static void main(String[] args) {
        char []a = {'A', 'B', 'C', 'G', 'A', 'G'};
//                 {'G','A','B'};


        Q4 obj = new Q4();

        System.out.println(obj.subsequenceCount(a));

    }
}
