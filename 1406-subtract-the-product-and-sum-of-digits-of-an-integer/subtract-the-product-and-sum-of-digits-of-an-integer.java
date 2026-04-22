class Solution {
    public int subtractProductAndSum(int n) {
       int mul = 1; 
       int sum = 0; 
        
        while(n>0)
        {
          int rem = n%10;
          sum = sum + rem;
          mul = mul*rem;
          n = n/10;
        }
        int result = mul - sum;
        return result;
    }
}