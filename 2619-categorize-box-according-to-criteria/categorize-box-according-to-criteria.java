class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
         if(((long)length*width*height>=1000000000 || length>=10000 || width>=10000 ||  height>=10000)  &&  mass >= 100)
        {
             return "Both";
        }
        
        else if((long)length*width*height>=1000000000 ||length>=10000 || width>=10000 ||  height>=10000 )
        {
             return "Bulky";
        }
        else if(mass >= 100)
        {
             return "Heavy";
        }
        else{
            return "Neither";
        }
    }
}