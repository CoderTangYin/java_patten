package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        Map<Integer, String> map = dig_letter_map();
        List<String> listRes = new ArrayList<>();
        listRes.add(" ");
        char[] chars = digits.toCharArray();
        for (int i = 0; i < chars.length; i++) {
             int ic =  chars[i] - '0';
             List<String> list1 = new ArrayList<>();
             String str = map.get(new Integer(ic));
             char[] strArr = str.toCharArray();
             for (int j = 0; j < strArr.length; j++) {
                 char s = strArr[j];
                 for (int k = 0; k < listRes.size(); k++) {
                     String temp = listRes.get(k);
//                     char s1 = temp.charAt(0);
//                     String str2 = Character.toString(s1);
                     String str1 = Character.toString(s);
                     list1.add((temp+str1).replace(" ", ""));
                     System.out.println(list1);
                 }
             }
             listRes = list1;
        }
        return listRes;
    }

    public Map<Integer, String> dig_letter_map() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0,"0");
        map.put(1,"1");
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jhk");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        return map;
    }


    private char[][] lettersArray = {
            {'a','b','c'},
            {'d','e','f'},
            {'j','k','l'},
            {'m','n','o'},
            {'p','q','r','s'},
            {'t','u','v'},
            {'w','x','y','z'},
    };

    private char[] chars;
    /** 存储每层选择的字符 */
    private char[] string;
    private List<String> list;

    public List<String> letterCombinations1(String digits) {
        if (digits == null) return null;
        list = new ArrayList<>();
        chars = digits.toCharArray();
        if (chars.length == 0) return null;
        string = new char[chars.length];
        dfs(0);
        return list;
    }

    private void dfs(int idx) {
        // 深度到达最底层
        if (idx == chars.length) {
            list.add(new String(string));
            return;
        }

        // 枚举当前层可以做的选择
        char[] letters = lettersArray[chars[idx] - '2'];
        for (char letter: letters) {
            // 取出当前层的一个
            string[idx] = letter;
            // 进入下一层
            dfs(idx+1);
        }
    }



    public static void main(String[] args) {
        LetterCombinations letterCombinations = new LetterCombinations();
//        System.out.println(letterCombinations.letterCombinations("234"));
        System.out.println(letterCombinations.letterCombinations1("23"));

    }
}
