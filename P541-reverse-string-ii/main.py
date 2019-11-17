class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        return ''.join([s[2*i*k:2*i*k+k][::-1]+s[2*i*k+k:2*i*k+k+k] for i in range(len(s)//(2*k)+1)])
