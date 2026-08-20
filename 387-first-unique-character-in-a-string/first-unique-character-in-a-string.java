class Solution {
    public int firstUniqChar(String s) {
      
        for(int i = 0; i<s.length();i++)
        {   boolean flag = false;
            char ch = s.charAt(i);

          for(int j =0; j<s.length(); j++)
          {
             if(i != j && ch == s.charAt(j))
             {
                flag= true;
                break;
             }
          }
         if(flag==false)
        {
            return i;
        }
        }
        return -1;
    }
}