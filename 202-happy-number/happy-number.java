class Solution 
{
    public boolean isHappy(int n) 
    {
        
        while(n != 1 && n != 4)   // repeat until 1 or loop
        {
            int sum = 0; 
            
            while(n > 0)//100>0
            {
                int rem = n % 10;// 
                n = n / 10;// 0
                sum = sum + (rem * rem); // 0 + 1*1 ==>1  // correct logic
            }
            
            n = sum; // 1  // update n for next cycle
        }
        
        if(n == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}