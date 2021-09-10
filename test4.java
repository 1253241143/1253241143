import java.util.*;
public class test4 {
    public static void main(String[] args) {
        String str = "sdnasjhdasdaksnfcjdshdfufhaosinfdsjncxkjz";
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        char[] arr = str.toCharArray();
        for (char ch : arr) {
            if (map.containsKey(ch)) {
                Integer old = map.get(ch);
                map.put(ch, old + 1);
            } else {
                map.put(ch,1);
            }
        }
        System.out.println(map);
    }
}