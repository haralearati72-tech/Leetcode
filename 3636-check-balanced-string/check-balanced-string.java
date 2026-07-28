class Solution {
    public boolean isBalanced(String num) {
      int esum = 0;
      int osum = 0; 
      char ch[] = num.toCharArray();
      for(int i = 0; i<ch.length; i++)
      {
        if(i%2==0)
        {
            esum = esum+(ch[i]-'0');
        }
       else
        {
          osum = osum + (ch[i ] - '0');
        }
      }
      if(esum == osum)
      {
        return true;
      } 
      else
      {
        return false;
      } 
    }
}