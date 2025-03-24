import java.util.HashMap;

public class Leetcode76 {
    public String minWindow(String s, String t) {
        if(s==null || t==null || s.length()<t.length()){
            return "";
        }
        HashMap<Character,Integer>charFreq=new HashMap<>();
        for(char c:t.toCharArray()){
            charFreq.put(c, charFreq.getOrDefault(c,0)+1);
        }

        HashMap<Character, Integer>windowCount= new HashMap<>();
        int start=0, matched=0,minLength=Integer.MAX_VALUE;
        int minStart=0;
        for(int end=0;end<s.length();end++){
            char endChar=s.charAt(end);
            windowCount.put(endChar, windowCount.getOrDefault(endChar,0)+1);
            if(charFreq.containsKey(endChar) && windowCount.get(endChar).equals(charFreq.get(endChar))){
                matched++;
            }
            while(matched==charFreq.size()){
                if(end-start+1<minLength){
                    minLength=end-start+1;
                    minStart=start;
                }
                char startChar=s.charAt(start);
                windowCount.put(startChar, windowCount.get(startChar)-1);
                if(charFreq.containsKey(startChar) && windowCount.get(startChar)<charFreq.get(startChar)){
                    matched--;
                }
                start++;
            }
        }
        return minLength==Integer.MAX_VALUE ?"":s.substring(minStart, minStart+minLength);
    }
}
