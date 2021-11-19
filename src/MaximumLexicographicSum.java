import java.util.ArrayList;

public class MaximumLexicographicSum {
    public static void main(String [] args){
String s="leetcode";
        ArrayList<Integer> ls=new ArrayList<>();
        char alpha='a';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>alpha){
                ls.add(i);
                alpha=s.charAt(i);
            }
            System.out.println(alpha);
        }
        String maxString ="";
        System.out.println(ls.toString());
        for(int i=0;i<ls.size();i++){
            if(s.substring(ls.get(i),s.length()).compareTo(maxString)>0);
            maxString=s.substring(ls.get(i),s.length());
            System.out.println(maxString);
        }
        System.out.println(maxString);
    }

}
