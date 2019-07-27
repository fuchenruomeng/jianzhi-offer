package 字符串;

import java.util.ArrayList;
import java.util.HashMap;

public class FirstCharOnlyOne {
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    ArrayList<Character> list = new ArrayList<Character>();

    public void insert(char c) {
        if (map.containsKey(c)) {
            map.put(c, map.get(c) + 1);
        } else {
            map.put(c, 1);
        }
        list.add(c);
    }

    public char GetFirstChar() {
        char c ='*';
        for (char key : list) {
            if (map.get(key) == 1) {
                 c = key;
                break;
            }
        }
        return c;
    }
}