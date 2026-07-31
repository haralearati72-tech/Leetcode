class Solution {
    public int splitNum(int num) {
    char [] ch = (num+"").toCharArray();

    Arrays.sort(ch);
    int n1 = 0;
    int n2 = 0;
    for(int i = 0; i<ch.length; i++)
    {
        if(i%2 == 0)
        {
            n1 = n1*10 + ch[i] -'0';
        }
        else
        {
            n2 = n2*10+ch[i] -'0';
        }

    }
    return n1 + n2; 
    }
}