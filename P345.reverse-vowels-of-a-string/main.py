class Solution:
    def reverseVowels(self, s: str) -> str:
        y = ['a', 'e', 'u', 'i', 'o', 'A', 'E', 'U', 'I', 'O']
        s = list(s)
        start = 0
        end = len(s)-1
        while end > start:
            while (start < end) and (s[start] not in y):
                start += 1
            while (end > 0) and (s[end] not in y):
                end -= 1
            if s[start] in y and s[end] in y:
                s[start], s[end] = s[end], s[start]
                start += 1
                end -= 1
        return ''.join(s)


if __name__ == "__main__":
    s = Solution()
    case = "hello"
    print('res=', s.reverseVowels(case))
    pass
