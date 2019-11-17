class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if (bits.length < 2)
            return true;
        if (bits[bits.length - 12 == 0)
            return true;
        for (int i = 0; i < bits.length;) {
            if (bits[i] == 0) {
                i++;
                if (i == bits.length)
                    return true;
            } else {
                i += 2;
            }
        }
        return false;
    }
}

// 只与最后一个0前面1连续的个数有关系
// class Solution {
//     public boolean isOneBitCharacter(int[] bits) {
//         int count = 0, i = bits.length - 2;
//         while (i >= 0 && bits[i--] == 1) {
//             count++;
//         }
//         return count % 2 == 0;
//     }
// }