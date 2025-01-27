
// import 'List' class from Java's utility package to use 'List' collection & its respective built-in methods
import java.util.List;
// import 'Collections' -- super-parent class of 'List' to use .sort() method
// https://stackoverflow.com/questions/16252269/how-to-sort-a-list-arraylist
import java.util.Collections;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        // utilize built-in .sort() method from Collections super-parent class to sort 'nums' in "natural" order -- default: ASC
        Collections.sort(nums);
        // Collections.reverse(nums);   // ------ enable this if want in DESC order
        // retrieve .size() of 'nums' List
        int numsSize = nums.size();
        // .get() last element & 2nd to last element in now sorted 'nums' List in ascending fashion --- aka these are the 2 largest Integers
        int lastElem = nums.get(numsSize - 1);
        int secLastElem = nums.get(numsSize - 2);
        // return sum of the two largest Integers
        return (lastElem + secLastElem);
    }
}