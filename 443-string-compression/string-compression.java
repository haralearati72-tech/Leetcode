class Solution {
    public int compress(char[] chars) {
       
       int  index = 0;
       for(int i = 0; i<chars.length; i++)
       {  int count = 1;
          while(i < chars.length-1 && chars[i] == chars[i+1])
          {
            count++;
            i++;
          }
           chars[index] = chars[i];
            index++;
          if(count > 1)
          {
              String str = count + "";

                for(int j = 0; j < str.length(); j++)
                {
                    chars[index] = str.charAt(j);
                    index++;
                }
            }
          
       } 
       return index;
    }
}