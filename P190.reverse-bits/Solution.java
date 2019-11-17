public class Solution {
    // you need treat n as an unsigned value
    // 如果多次调用这个函数，你将如何优化你的算法？
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32; i++) {
            rev = rev << 1;
            rev += (n >>> i) & 1;
        }
        return rev;
    }
}

// 另一种解法，CPP，不用循环
// class Solution {
//     public:
//     uint32_t reverseBits(uint32_t i) {
//         i = (i & 0x55555555) << 1 | (i >> 1) & 0x55555555;
//         i = (i & 0x33333333) << 2 | (i >> 2) & 0x33333333;
//         i = (i & 0x0f0f0f0f) << 4 | (i >> 4) & 0x0f0f0f0f;
//         i = (i & 0x00ff00ff) << 8 | (i >> 8) & 0x00ff00ff;
//         i = (i & 0x0000ffff) << 16 | (i >> 16) & 0x0000ffff;
//         return i;
// }};

// JAVA >>>无符号右移
// public int reverseBits(int i) {
//     i = (i & 0x55555555) << 1 | (i >>> 1) & 0x55555555;
//     i = (i & 0x33333333) << 2 | (i >>> 2) & 0x33333333;
//     i = (i & 0x0f0f0f0f) << 4 | (i >>> 4) & 0x0f0f0f0f;
//     i = (i << 24) | ((i & 0xff00) << 8) | ((i >>> 8) & 0xff00) | (i >>> 24);
//     return i;
// }
