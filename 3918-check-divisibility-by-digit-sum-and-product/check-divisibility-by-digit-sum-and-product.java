class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int temp = n;

        while(n>0)
        {
            int rem = n%10;
            n = n/10;
            sum = sum+rem;
            product = product *rem;
        }
        int add = sum+product;
        if(temp%add == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}