package find_numbers_with_even_number_of_digits;

class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;
        for (int num :
                nums) {
//            if (getNumberOfDigits(num) % 2 == 0)
//                count++;
            if ((num > 9 && num <100) || (num > 999 && num < 10000) || (num == 100000))
                count++;
        }
        return count;
    }

    private int getNumberOfDigits(int num) {
        int count = 1;
        while (num > 9) {
            num = num / 10;
            count++;
        }
        return count;
    }

}
