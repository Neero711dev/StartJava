package arrays;

public class array_test {
    public static int maxTriple(int[] nums) {
        int first = nums[0];
        int second = nums[nums.length/2];
        int third = nums[nums.length-1];
        int a = Math.max(first, second);
        int b = Math.max(a, third);
        return Math.max(a,b);
    }
}
