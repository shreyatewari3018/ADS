public class StringCompression {
public static String compress(String s) {
    if(s==null||s.length()==0) return "";
    StringBuilder c=new StringBuilder();
    int count=1;
    for(int i=1;i<s.length();i++){
        if(s.charAt(i)==s.charAt(i-1)){
            count++;
        }else{
            c.append(s.charAt(i-1)).append(count);
            count=1;
        }
    }
    c.append(s.charAt(s.length()-1)).append(count);
    return c.toString();
    }

    public static void main(String args[]){
        String s="aaabbc";
        System.out.println(compress(s));
    }
}