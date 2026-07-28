class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        char [] ch = s.toCharArray();
        int i = 0;
        for( i = 1; i<ch.length; i++)
        {
           if(Math.abs(ch[i] - ch[i-1]) > 2)
           {
            return false;
           }
        }
        return true;
    }
}