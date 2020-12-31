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
                     char s1 = temp.charAt(0);
                     String str2 = Character.toString(s1);
                     String str1 = Character.toString(s);
                     list1.add((str2+str1).replace(" ", ""));
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

    public static void main(String[] args) {
        LetterCombinations letterCombinations = new LetterCombinations();
        System.out.println(letterCombinations.letterCombinations("23"));
    }
}
