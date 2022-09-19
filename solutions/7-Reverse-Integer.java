class Solution {
    public int reverse(int x) {
        int xRev = 0;

        while(x != 0) {
            int temp = x % 10;
            x /= 10;

            if (xRev > Integer.MAX_VALUE / 10 || xRev == Integer.MAX_VALUE / 10 && temp > 7) return 0;
            if (xRev < Integer.MIN_VALUE / 10 || xRev == Integer.MIN_VALUE / 10 && temp < -8) return 0;

            xRev = xRev * 10 + temp;
        }
        return xRev;
    }
}