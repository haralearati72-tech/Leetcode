class Solution 
{
    public boolean checkPerfectNumber(int num)
    {
        int result = 0;

        for(int i = 1; i < num; i++)
        {
            if(num % i == 0)//28%14==0
            {
                result = result + i;//14+14=28
            }
        }

        if(result == num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}