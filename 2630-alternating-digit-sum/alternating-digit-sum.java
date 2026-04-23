class Solution {
    public int alternateDigitSum(int n) {
       int rev = 0;
       while(n>0) 
       {
        int rem = n%10;
         rev = (rev*10)+ rem;
         n = n/10;
       }
       int sum = 0;
       int sign = 1;
       while(rev>0)
       {
          int rem = rev%10;
          sum = sum+(rem*sign);
          sign = -sign;
          rev = rev/10;
       }
       return sum;
    }
}