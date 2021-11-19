import java.math.BigInteger;
import java.util.Scanner;

public class Formatting {
    static long x=0l;
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
        String name=sc.nextLine().replace(" ","");
        System.out.println("password in octal:  "+password_in_octal(name));
        System.out.println("password in hexadecimal:  "+hexadecimal_notation(x));
    }

    public static  String password_in_octal(String name)
    {
        char [] names_unicode=name.toCharArray();
        int []unicode_number=new int[name.length()];
//System.out.println(names_unicode[0]-'0');
        StringBuilder sb=new StringBuilder("");

        for(int i=0;i<names_unicode.length;i++) {
            int number = names_unicode[i] -'0', reverse = 0;
            while(number != 0)
            {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number/10;
            }
            unicode_number[i] = reverse;
            //System.out.println(reverse);
            sb.append(unicode_number[i]);
        }
        //System.out.println(sb.toString());
        BigInteger value=new BigInteger(sb.toString());

       // long value=Long.valueOf(sb.toString());
        //System.out.println(value);
        String s=sb.toString();
        while(s.length()!=5){
            value=value.divide(new BigInteger("5"));
            s=s.valueOf(value);
        }
        x=Long.valueOf(s);
        return octal_notation(Long.valueOf(s));

    }
    public static  String octal_notation(Long value){
        return Long.toOctalString((Long)value);
    }
    public static String hexadecimal_notation(Long value){
        return Long.toHexString(value);
    }
}
