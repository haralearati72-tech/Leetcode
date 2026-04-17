class Solution {
    public int reachNumber(int target) {
    target = Math.abs(target);//3
    int sum = 0, step = 0;
    while(sum<target || (sum - target)%2!=0)
    {
      step++;//1,2
      sum = sum + step;// 1+2==>3
    }
    return step;
    }
}