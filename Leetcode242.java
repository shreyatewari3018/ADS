import java.util.Arrays;

public class Leetcode242 {
    public boolean isAnagram(String s, String t) {
        char[] arr= s.toCharArray();
        char[] arr2= t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        String s1=new String(arr);
        String t2=new String(arr2);
        if(s1.equals(t2)){
            return true;
        }
        return false;
    }
}
