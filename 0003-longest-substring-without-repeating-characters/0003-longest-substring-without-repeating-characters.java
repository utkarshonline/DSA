class Solution {
    public int lengthOfLongestSubstring(String s) {
          HashMap<Character, Integer> lastIndexMap = new HashMap<>();
        
        int maxLength = 0;  
        int start = 0;      
        
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            
   
            if (lastIndexMap.containsKey(currentChar)) {
                start = Math.max(start, lastIndexMap.get(currentChar) + 1);
            }
            
          
            lastIndexMap.put(currentChar, end);
            
          
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }
}