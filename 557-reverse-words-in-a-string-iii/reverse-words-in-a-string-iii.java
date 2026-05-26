class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.split(" ");
        String result = "";

        for(int i = 0; i < words.length; i++)
        {
            String word = words[i];

            for(int j = word.length() - 1; j >= 0; j--)
            {
                result = result + word.charAt(j);
            }

            result = result + " ";
        }

        return result.trim();
    }
}