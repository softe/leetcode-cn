class Solution {
    public boolean checkPossibility(int[] nums) {
        int i = 0;
        int cnt = 0;
        if (nums.length < 3) {
            return true;
        }
        for (; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                cnt++;
                if (cnt == 2)
                    return false;

                // 关键在于把前面的变小还是把后面的变大
                if (0 == i) {
                    nums[i] = nums[i + 1];
                } else {
                    if (nums[i - 1] > nums[i + 1]) {
                        nums[i + 1] = nums[i];
                    } else {
                        nums[i] = nums[i + 1];
                    }
                }
            }
        }
        return true;
    }
}