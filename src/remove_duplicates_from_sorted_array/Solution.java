package remove_duplicates_from_sorted_array;

class Solution {
    public int removeDuplicates(int[] nums) {
        int slowRunner = 0;
        for (int fastRunner = 1; fastRunner < nums.length; fastRunner++) {
            if (nums[fastRunner] != nums[slowRunner]) {
                nums[++slowRunner] = nums[fastRunner];
            }
        }
        return slowRunner + 1;
    }
}
