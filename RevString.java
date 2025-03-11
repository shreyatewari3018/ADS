import java.util.*;

public class RevString {
    public static String rev(String str){
        char[] arr=str.toCharArray();
        StringBuilder s1=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            s1.append(arr[i]);
        }
        return s1.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(rev(str));
    }
}
