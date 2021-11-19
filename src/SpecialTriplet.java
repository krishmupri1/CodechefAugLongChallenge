import java.util.Scanner;

public class SpecialTriplet {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            for (int i = 1; i <= n; i++) {

                for (int j = 2; j <=n; j++) {

                    if (i % j == 0) continue;
                    //System.out.println("pahla"+i + " " + j + " " + (i % j));
                    if (j % (i % j) == 0) {
                        System.out.println("asli"+i + " " + j + " " + (i % j));
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
