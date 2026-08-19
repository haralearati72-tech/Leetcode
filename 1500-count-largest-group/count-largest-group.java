class Solution {
    public int countLargestGroup(int n) {
        int[]count = new int[37];
        
        for(int i = 1; i<=n; i++)
        {
            int num  = i;
            int sum = 0;

            while(num>0)
            {
                sum+=num%10;
              num=  num/10;
            }
            count[sum]++;
        }
        int max=0;
        for(int i = 1; i<37;i++)
        {
            if(count[i]>max)
            {
                max = count[i];
            }
        }
        int  answer = 0;
        for(int i = 1; i<37; i++)
        {
            if(count[i]==max)
            {
                answer++;
            }
           
        }
        return answer;
    }
}