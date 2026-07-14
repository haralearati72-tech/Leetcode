class Solution {
    public int lengthOfLastWord(String s) {
        String [] words = s.split(" ");
        int count = 0;
        for(int i = 0; i<words[words.length-1].length();i++)
        {
            count++;
        }
        return count;
    }
}