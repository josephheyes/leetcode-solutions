import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums, 3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];

        int j = 0;
        for(int i = 0; i < n; i++) {
            result[j++] = nums[i];
            result[j++] = nums[i+n];
        }
        return result;
    }
}
