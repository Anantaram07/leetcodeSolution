class Solution {
    public String removeStars(String s) {
       int starsCount = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i>=0; i--) {

            if (s.charAt(i) == '*') {
                
                starsCount++;
            } else {

                if (starsCount > 0) {
                    starsCount--;
                } else {
                    sb.append(s.charAt(i));
                }
            }
        }

        return sb.reverse().toString();        
    }
} 
    