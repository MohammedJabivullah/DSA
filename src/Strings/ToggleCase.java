package Strings;

public class ToggleCase {
    public static void main(String[] args) {
        String s = "aAbB$";
        shift(s);
    }
    public static void shift(String st){
        int StrLen = st.length();

        for(int i=0;i<StrLen;i++){
            if(st.charAt(i)<='z' && st.charAt(i)>='a'){
                System.out.print((char) (st.charAt(i)-32));
            }else if (st.charAt(i)<='Z' && st.charAt(i)>='A'){
                System.out.print((char) (st.charAt(i)+32));
            }else{
                System.out.print(st.charAt(i));
            }
        }
    }
}
