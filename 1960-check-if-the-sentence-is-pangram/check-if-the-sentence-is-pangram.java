class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean [] present = new boolean[26];

        for(int i =0; i<sentence.length();i++)
        {
            char ch = Character.toLowerCase(sentence.charAt(i));
            if(ch >='a'&&ch<='z')
            {
                present[ch - 'a'] = true;
            }
        }
        for(int i = 0; i<26; i++)
        {
            if(present[i] == false)
            {
                return false;
            }
        }
        return true;
    }
}