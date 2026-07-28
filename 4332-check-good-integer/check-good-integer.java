class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum = 0;
        int squareSum = 0;
        int sqr = 0;
        while(n>0)
        {
            int rem = n%10;
            digitSum = digitSum + rem;

            sqr = rem * rem;
            squareSum = squareSum + sqr; 
            n = n/10;
        }
        if(squareSum - digitSum >=50)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}