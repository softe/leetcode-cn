//https://leetcode-cn.com/problems/valid-parentheses/
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.Map;
//
//class Solution {
//	private static final Map<Character, Character> map = new HashMap<Character, Character>() {
//		{
//			put('{', '}');
//			put('[', ']');
//			put('(', ')');
//			put('?', '?');
//		}
//	};
//
//	public boolean isValid(String s) {
//		if (s.length() > 0 && !map.containsKey(s.charAt(0)))
//			return false;
//		LinkedList<Character> stack = new LinkedList<Character>() {
//			{
//				add('?');
//			}
//		};
//		for (Character c : s.toCharArray()) {
//			if (map.containsKey(c))
//				stack.addLast(c);
//			else if (map.get(stack.removeLast()) != c)
//				return false;
//		}
//		return stack.size() == 1;
//	}
//}

/**
 * @author Administrator
 *
 */
class Solution {
	public boolean isValid(String s) {
		if (s.length() == 0)
			return true;
		if (s.length() % 2 != 0)
			return false;
		char[] c = new char[s.length() / 2];
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case '(':
				if (j >= s.length() / 2)
					return false;
				c[j++] = '(';
				break;
			case '{':
				if (j >= s.length() / 2)
					return false;
				c[j++] = '{';
				break;
			case '[':
				if (j >= s.length() / 2)
					return false;
				c[j++] = '[';
				break;
			case ']':
				if (j <= 0)
					return false;
				if (c[--j] != '[')
					return false;
				break;
			case '}':
				if (j <= 0)
					return false;
				if (c[--j] != '{')
					return false;
				break;
			case ')':
				if (j <= 0)
					return false;
				if (c[--j] != '(')
					return false;
				break;
			default:
				return false;
			}
		}
		return j==0;

	}
}
