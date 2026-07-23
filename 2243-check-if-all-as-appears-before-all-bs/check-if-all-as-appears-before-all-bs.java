class Solution {
    public boolean checkString(String s) {
        boolean flag = true;
        for(int i = 0; i<s.length()-1; i++)
        {
            
            if(s.contains("ba"))
            {
                flag = false;
            }
           
        }
        if(flag==true)
        {
          return true;
        }
        else
        {
            return false;
        }
    }
}