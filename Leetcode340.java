import java.util.*;

public class Leetcode340 {
    //Longest Substring with at most k distinct chars:
    //Given a string s, and integer k, we have to find the length of longest substring
    //that contains atmost k distinct chars

    public static int lengthOfLongest(String s, int k){
        if(s==null || s.length()==0 || k==0) return 0;
        Map<Character,Integer>map=new HashMap<>();
        int left=0,maxLen=0;
        for(int ri=0;ri<s.length();ri++){
            char c =s.charAt(ri);
            map.put(c, map.getOrDefault(c, 0)+1);

            while(map.size()>k){
                char leftChar=s.charAt(left);
                map.put(leftChar, map.get(leftChar)-1);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                left++;
            }
            maxLen=Math.max(maxLen,ri-left+1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s="eceba";
        int k=2;
        System.out.println(lengthOfLongest(s, k));
    }
}
