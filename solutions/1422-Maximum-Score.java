class Solution {
    public int maxScore(String s) {
        int max = 0;
        for(int i = 1; i < s.length(); i++) {
            String left = s.substring(0, i);
            String right = s.substring(i);

            System.out.println(left);
            System.out.println(right);
            System.out.println(max);

            int lscore = 0, rscore = 0;
            for(int j = 0; j < left.length(); j++) {
                if(left.charAt(j) == '0') {
                    lscore++;
                }
            }

            for(int k = 0; k < right.length(); k++) {
                if(right.charAt(k) == '1') {
                    rscore++;
                }
            }
            int total = lscore + rscore;
            if(total > max) {
                max = total;
            }
        }
        return max;
    }
}