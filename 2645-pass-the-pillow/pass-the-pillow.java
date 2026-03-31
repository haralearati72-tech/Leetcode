class Solution {
    public int passThePillow(int n, int time) {
      int person = 1;      
      boolean isForward = true;  // direction
        
        while (time > 0) {
            
            if (isForward) {
                person++;
                
                if (person == n) {
                    isForward = false; // reached last person
                }
                
            } else {
                person--;
                
                if (person == 1) {
                    isForward = true; // reached first person
                }
            }
            
            time--; // one second used
        }
        
        return person;
    
    }
}