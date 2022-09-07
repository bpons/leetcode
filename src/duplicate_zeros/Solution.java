package duplicate_zeros;

class Solution {
    public void duplicateZeros(int[] arr) {
        int zeroesCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                zeroesCount++;
        }

        if (zeroesCount == 0)
            return;
        int right = (arr.length -1) + zeroesCount;
        while (right >= 0) {
            if (arr[right - zeroesCount] == 0) {
                if (right < arr.length)
                    arr[right] = 0;
                right--;
                if (right < arr.length)
                    arr[right] = 0;
                zeroesCount--;
            } else {
                if (right < arr.length)
                    arr[right] = arr[right - zeroesCount];
            }
            if (zeroesCount == 0)
                break;
            right --;
        }

    }

}
