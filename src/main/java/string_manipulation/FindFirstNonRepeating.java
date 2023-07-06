package string_manipulation;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeating {
    public static char findFirstRepeatingChar(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        for(char ch : str.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0';
    }
}
