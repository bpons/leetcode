package move_zeroes;

class Solution {
//    public void moveZeroes(int[] nums) {
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) {
//                int j = i + 1;
//                while (j < nums.length && nums[j] == 0) {
//                    j++;
//                }
//                if (j > nums.length -1)
//                    break;
//                nums[i] = nums[j];
//                nums[j] = 0;
//            }
//        }
//    }
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}
