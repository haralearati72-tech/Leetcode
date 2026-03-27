class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) 
    {
        int rem = purchaseAmount % 10;
        int n;
        
        if (rem < 5)
        {
            n = (purchaseAmount / 10) * 10;
            return (100 - n);
        }
        else if (rem >= 5)
        {
            n = ((purchaseAmount / 10) + 1) * 10;
            return (100 - n);
        }
        return 0;
    }
   
    
}