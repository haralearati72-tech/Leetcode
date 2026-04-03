class Solution 
{
    public boolean isUgly(int n) 
    {

        if(n <= 0) 
        {
            return false;
        }

        while(n % 2 == 0) //6%2 ==>0
        {
            n = n / 2;//6/2==>3
        }

        while(n % 3 == 0)//6%3==>0 
        {
            n = n / 3;//6/3==>2
        }

        while(n % 5 == 0) //6%5==>1
        {
            n = n / 5;//6/5==>1
        }

        return n == 1;
    }
}