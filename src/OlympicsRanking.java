import java.util.Scanner;

public class OlympicsRanking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int ans1 = 0;
            int ans2 = 0;
            int g1 = sc.nextInt();
            ans1 += g1;
            int s1 = sc.nextInt();
            ans1 += s1;
            int b1 = sc.nextInt();
            ans1 += b1;


            int g2 = sc.nextInt();
            ans2 += g2;
            int s2 = sc.nextInt();
            ans2 += s2;
            int b2 = sc.nextInt();
            ans2 += b2;

            int ans = (ans1 > ans2) ? 1 : 2;
            System.out.println(ans);

        }
    }
}
