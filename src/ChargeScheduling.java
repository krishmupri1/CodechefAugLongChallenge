import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class ChargeScheduling {


        static class Pair {
            int x;
            int y;

            Pair(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public int getX() {
                return this.x;
            }

            public int getY() {
                return this.y;
            }
        }




    static class FastInput {
        BufferedReader br;
        StringTokenizer st;

        public FastInput() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
                }
            }

            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (Exception e) {

            }
            return str;
        }

    }






    public static void main(String [] args){
        FastInput fs=new FastInput();
        int t=fs.nextInt();
        while(t-->0){
            int number_of_people=fs.nextInt();

            int amount_of_time[]=new int[number_of_people];
            int deboard[]=new int[number_of_people];
            List<Pair> ls=new ArrayList<>();
            for(int i=0;i<number_of_people;i++){
                ls.add(new Pair(amount_of_time[i],deboard[i]));
            }

            Collections.sort(ls, new Comparator<Pair>() {
                @Override
                public int compare(Pair o1, Pair o2) {
                    return o1.y-o2.y;
                }
            });

PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
int time=0;



        }
    }


}