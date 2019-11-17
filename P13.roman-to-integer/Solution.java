import java.util.HashMap;
import java.util.Map;

// C实现
//int romanToInt(char * s){
//    int nums[15] = {0};
//                    //十进制：十六进制：二进制
//    nums[9]  = 1;   //I:73:0X49:1001
//    nums[6]  = 5;   //V:86:0X56:0110
//    nums[8]  = 10;  //X:88:0X58:1000
//    nums[12] = 50;  //L:76:0X4C:1011
//    nums[3]  = 100; //C:67:0X43:0011
//    nums[4]  = 500; //D:68:0X44:0100
//    nums[13] = 1000;//M:77:0X4D:1101
//    for(unsigned char i = 0;s[i] != '\0';i++) {
//        if(nums[s[i] & 0xf] >= nums[s[i+1] & 0xf])
//            nums[1] += nums[s[i] & 0xf];
//        else
//            nums[1] -= nums[s[i] & 0xf];
//    }
//    return nums[1];
//}
//

//class Solution {
//    public int romanToInt(String s) {
//        Map<String, Integer> map = new HashMap<>();
//        map.put("I", 1);
//        map.put("IV", 4);
//        map.put("V", 5);
//        map.put("IX", 9);
//        map.put("X", 10);
//        map.put("XL", 40);
//        map.put("L", 50);
//        map.put("XC", 90);
//        map.put("C", 100);
//        map.put("CD", 400);
//        map.put("D", 500);
//        map.put("CM", 900);
//        map.put("M", 1000);
//        
//        int ans = 0;
//        for(int i = 0;i < s.length();) {
//            if(i + 1 < s.length() && map.containsKey(s.substring(i, i+2))) {
//                ans += map.get(s.substring(i, i+2));
//                i += 2;
//            } else {
//                ans += map.get(s.substring(i, i+1));
//                i ++;
//            }
//        }
//        return ans;
//    }
//}
class Solution {
	public int romanToInt(String s) {
		// 算法一：判断后面数值是否大于前面
		Map<Character, Integer> romaNumber = new HashMap<>();
		romaNumber.put('I', 1);
		romaNumber.put('V', 5);
		romaNumber.put('X', 10);
		romaNumber.put('L', 50);
		romaNumber.put('C', 100);
		romaNumber.put('D', 500);
		romaNumber.put('M', 1000);

		int firstValue = 0;
		int nextValue = 0;
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			firstValue = romaNumber.get(s.charAt(i));
			if (i == s.length() - 1) {
				sum += firstValue;
			} else {
				nextValue = romaNumber.get(s.charAt(i + 1));
				if (firstValue >= nextValue) {
					sum += firstValue;
				} else {
					sum -= firstValue;
				}
			}
		}
		return sum;
	}
}
