public class FMPN {
    //To find the First Missing Positive Integer in given array
    //With time complexity O(N) and space complexity O(1)

    //solution
    public static int missing(int[] arr){
        int i=0;
        while(i<arr.length){
            if (arr[i] < 1 || arr[i] > arr.length || arr[i]-1==i) {
                i++;
            }else{
                if (arr[i] == arr[arr[i]-1]){
                    i++;
                }else{
                    int temp = arr[i];
                    arr[i] = arr[arr[i]-1];
                    arr[temp-1] = temp;
                }
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]-1!=j){
                return j+1;
            }
        }
        return arr.length+1;
    }
    public static void main(String[] args) {
        //giving ⬇️ This array as in put ANS: 4
     int[] A = {3,-2,1,2,7};
        System.out.println(FMPN.missing(A));
    }
}
