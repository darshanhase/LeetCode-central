class Solution {
    public String mergeAlternately(String word1, String word2) {
    String merged = "";
    int i = 0;
    int j = 0;

    while(i < word1.length() && j < word2.length()){
        
        merged = merged + word1.charAt(i);
        merged = merged + word2.charAt(j);
        i++;
        j++;
        

    }
    while(i < word1.length()){

        merged = merged + word1.charAt(i);
        i++;
    } 
    while(j < word2.length()){

        merged = merged + word2.charAt(j);
        j++;
    }

    return merged;

    }
}