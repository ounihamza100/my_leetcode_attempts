package solutions;

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 * Example :
     * Input: nums = [555,901,482,1771]
     * Output: 1
     * Explanation:
     * Only 1771 contains an even number of digits.
 * @author hamza.ouni
 */
public class FindNumberswithEvenNumberofDigits {

    public static int findNumbers(int[] nums) {
        int result = 0;
        int counter = 0;

        for(int i=0; i<nums.length; i++) {
            while(nums[i]>0) {
                nums[i] = nums[i] / 10;
                counter++;
            }
            if(counter!= 0 && counter % 2 ==0) result++;
            counter = 0;
        }
        return result;
    }

    public static void main(String[] args) {
         int []nums = {437,315,322,431,686,264,442};// Expected value is 0
         System.out.println(findNumbers(nums));
    }
}
