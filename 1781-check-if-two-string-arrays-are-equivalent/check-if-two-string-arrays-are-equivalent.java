class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    

        String a = "";
        String b = "";

        // build string from word1
        for (int i = 0; i < word1.length; i++) {
            a = a + word1[i];
        }

        // build string from word2
        for (int i = 0; i < word2.length; i++) {
            b = b + word2[i];
        }

        // compare both
        return a.equals(b);
    }
}
    