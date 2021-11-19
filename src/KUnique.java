import java.util.HashMap;

public class KUnique {
    public static void main(String[] args) {
        String s = "a a b a c b e b e b e";
        //0123
        int k=3;
        // code here
        int maxi = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
       // hm.put(s.charAt(i),0);
        while (j < s.length()) {
            {
               // hm.put(s.charAt(j),1+hm.getOrDefault(s.charAt(j),0));
                if (!hm.containsKey(s.charAt(j))) {
                hm.put(s.charAt(j), 1);
            } else {
                int currentCount = hm.get(s.charAt(j));
                currentCount++;
                hm.put(s.charAt(j), currentCount);
            }
                if (hm.size() < k) {
                    System.out.println("1"+" "+hm.keySet());
                } else if (hm.size() == k) {
                    maxi = Math.max(maxi, j - i + 1);
                    System.out.println(i+" "+j);

                    System.out.println("2"+" "+hm.toString());
                }
                else if (hm.size() > k) {
                    while (hm.size() > k) {
                        hm.put(s.charAt(i), hm.get(s.charAt(i)) - 1);
                        if (hm.get(s.charAt(i)) == 0){
                            hm.remove(s.charAt(i));
                        }
                        i++;
                    }
                    System.out.println("3"+" "+hm.toString());
                }
                j++;
            }
        }
   System.out.println(Integer.valueOf("07"));
        System.out.println(maxi);
    }
}



