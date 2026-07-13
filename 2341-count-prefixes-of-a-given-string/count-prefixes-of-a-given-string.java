class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;

        for(int i = 0; i<words.length; i++)
        {
            String word = words[i];
            boolean flag = true;
         
           if(word.length() >  s.length())
           {
            continue;
           }

            for(int j = 0; j<word.length(); j++)
            {
                if(word.charAt(j)!= s.charAt(j))
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                count++;
            }
        }
        return count;
    }
}