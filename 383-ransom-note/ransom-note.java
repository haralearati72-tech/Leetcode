class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       
       char ch[] = magazine.toCharArray();
       boolean [] used = new boolean[ch.length];

       for(int i = 0; i<ransomNote.length(); i++)
       {
         boolean flag = false;
        for(int j = 0; j<ch.length; j++)
        {
            if(!used[j] && ransomNote.charAt(i) == ch[j])
            {
              used[j]=true;
              flag=true;
              break;
            }
        }
        if(flag == false)
        {
            return false;
        }
       }
       return true;

    }
}