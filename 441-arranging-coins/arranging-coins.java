class Solution {
    public int arrangeCoins(int n) {
       int  row = 1;

     while(n >= row)//5
     {
         n = n - row;// n=5-1=4
         row++;
     }
     return row - 1;
    }
}