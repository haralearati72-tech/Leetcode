class Solution {
    public boolean isValid(String word) {
       if(word.length()<3)
       {
        return false;
       }
       boolean vowel = false;
       boolean consonants = false;

       for(int i = 0; i<word.length(); i++)
       {
        char ch = word.charAt(i);
        if((ch >='A' && ch <='Z')|| (ch >='a' && ch <= 'z'))
        {
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch =='O' || ch=='U' ||
               ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch=='u')
            {
                 vowel = true;
            }
            else
            {
                consonants = true;
            }
        }
         else if(ch >='0' && ch <= '9')
            {

            }
            else
            {
               return false;
            }
       
       }
       return vowel && consonants;
    }
}