class Solution {
    // 利用P7的代码，其实可以不用考虑溢出，因为溢出的一定不是回文数
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x = x / 10;
            // 关键在于反转后可能溢出整型是有范围的
            // 字符串转换的效率较低且使用较多库函数
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > Integer.MAX_VALUE % 10)) {
                rev = 0;
                break;
            } else if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && x < Integer.MIN_VALUE % 10)) {
                rev = 0;
                break;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            return reverse(x) == x;
        }
    }
}

// 转为字符串
// class Solution {
//     public boolean isPalindrome(int x) {
//         String reversedStr = (new StringBuilder(x + "")).reverse().toString();
//         return (x + "").equals(reversedStr);
//     }
// }

// 为了避免数字反转可能导致的溢出问题，为什么不考虑只反转数字的一半？
// 毕竟，如果该数字是回文，其后半部分反转后应该与原始数字的前半部分相同。
// 现在的问题是，我们如何知道反转数字的位数已经达到原始数字位数的一半？
// 我们将原始数字除以 10，然后给反转后的数字乘上 10，
// 所以，当原始数字小于反转后的数字时，就意味着我们已经处理了一半位数的数字。

// class Solution {
//     public boolean isPalindrome(int x) {
//         // 思考：这里大家可以思考一下，为什么末尾为 0 就可以直接返回 false
//         if (x < 0 || (x % 10 == 0 && x != 0))
//             return false;
//         int revertedNumber = 0;
//         while (x > revertedNumber) {
//             revertedNumber = revertedNumber * 10 + x % 10;
//             x /= 10;
//         }
//         return x == revertedNumber || x == revertedNumber / 10;
//     }
// }

// 每次比较首位和最后一位
// class Solution {
//     public boolean isPalindrome(int x) {
//         // 边界判断
//         if (x < 0)
//             return false;
//         int div = 1;
//         while (x / div >= 10)
//             div *= 10;
//         while (x > 0) {
//             int left = x / div;
//             int right = x % 10;
//             if (left != right)
//                 return false;
//             x = (x % div) / 10;
//             div /= 100;
//         }
//         return true;
//     }
// }