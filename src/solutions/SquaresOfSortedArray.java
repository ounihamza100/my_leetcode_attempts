package solutions;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

/**
 * Problem : Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number sorted in non-decreasing order
 *
 * Example : Input: nums = [-4,-1,0,3,10]
 *           Output: [0,1,9,16,100]
 *           Explanation: After squaring, the array becomes [16,1,0,9,100].
 *           After sorting, it becomes [0,1,9,16,100].
 *
 *
 * @author hamza.ouni
 */
public class SquaresOfSortedArray {
    public static int[] sortedSquares(int[] nums) {

        int afterSquaring[] = new int[nums.length];

        for(int i = 0 ; i<nums.length; i++) {
            afterSquaring[i] = nums[i] * nums[i];
        }
        if(nums[0]>0) return afterSquaring;
        else {
            Arrays.sort(afterSquaring);
            return afterSquaring;
        }
    }

    public static void main(String[] args) {
        int nums[] = {-4,-1,0,3,10};
        nums =  sortedSquares(nums);
        System.out.println(Arrays.toString(nums));
    }
}
