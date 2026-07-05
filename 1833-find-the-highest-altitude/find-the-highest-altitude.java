class Solution {
    public int largestAltitude(int[] gain) {
        int curent = 0;
        int highest = 0;
        for(int i = 0; i< gain.length; i++)
        {
            curent = curent + gain[i];
            if(curent > highest)
            {
                highest = curent;
            }
        }
        return highest;
    }
}