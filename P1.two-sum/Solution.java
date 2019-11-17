class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target) {
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         //空间换时间
//         //新建哈希表
//         Map<Integer, Integer> map = new HashMap<>();
//         for(int i = 0; i< nums.length; i++) {
//             //如果表中存在配对，返回结果
//             if(map.containsKey(target - nums[i])) {
//                 return new int[] {map.get(target-nums[i]),i};
//             }
//             //如果表中不存在，将当前值和索引存入表中
//             map.put(nums[i], i);
//         }
//         throw new IllegalArgumentException("No two sum solution");
//     }
// }