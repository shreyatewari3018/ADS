import java.util.*;

public class Test {
    public static int countVowel(String str){
        int count=0;
        String vow = "aeiouAEIOU";
        for(int i=0;i<str.length();i++){
            if(vow.indexOf(str.charAt(i))!=-1){
                count++;
            }
        }
        return count; 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(countVowel(s1));
    }
}
