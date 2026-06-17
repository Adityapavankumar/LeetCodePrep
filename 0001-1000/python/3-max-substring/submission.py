class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        charLatestIndexMap = {} # stores characters latest index in the map
        start = 0
        maxLength = 0

        for i, char in enumerate(s):
            if (char in charLatestIndexMap) and (charLatestIndexMap[char] >= start):
                start = charLatestIndexMap[char] + 1
            charLatestIndexMap[char] = i
            maxLength = max(maxLength, i - start + 1) # add 1 since index ranges from 0 to n-1
        return maxLength
