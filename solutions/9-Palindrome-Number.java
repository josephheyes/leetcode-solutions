import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        isPalindrome(121);
    }

    public static boolean isPalindrome(int x) {
        int xRev = 0, input = x;
        if(x<0) {
            return false;
        }

        while(input != 0) {
            xRev = xRev * 10 + input % 10;
            input /= 10;
        }

        return (x==xRev);
    }
}
