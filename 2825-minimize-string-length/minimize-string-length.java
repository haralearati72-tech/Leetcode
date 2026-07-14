class Solution {
    public int minimizedStringLength(String s) {
        String res = "";
        int count=0;
        for(int i = 0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(res.indexOf(ch)==-1)
            {
                res = res+ch;
                count++;
            }
        }
        return count;
    }
}