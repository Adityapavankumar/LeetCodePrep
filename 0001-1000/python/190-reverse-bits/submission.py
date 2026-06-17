class Solution:
    # @param n, an integer
    # @return an integer
    def reverseBits(self, n):
        ans = 0
        for i in range(32): # 32 bit integer
            if (n >> i) & 1:
                ans|= 1 << 31-i # left shift 2 and or it
        return ans
