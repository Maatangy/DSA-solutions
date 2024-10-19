import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to store the sorted version of string as key and list of anagrams as value
        Map<String, List<String>> anagramMap = new HashMap<>();
        
        for (String str : strs) {
            // Convert string to char array, sort it, and then turn it back to string
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            // Add the original string to the corresponding anagram group
            if (!anagramMap.containsKey(sortedStr)) {
                anagramMap.put(sortedStr, new ArrayList<>());
            }
            anagramMap.get(sortedStr).add(str);
        }
        
        // Return the list of grouped anagrams
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        Solution solution = new Solution(); // Create an instance of the Solution class
        String[] input1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(solution.groupAnagrams(input1));

        String[] input2 = {""};
        System.out.println(solution.groupAnagrams(input2));

        String[] input3 = {"a"};
        System.out.println(solution.groupAnagrams(input3));
    }
}
