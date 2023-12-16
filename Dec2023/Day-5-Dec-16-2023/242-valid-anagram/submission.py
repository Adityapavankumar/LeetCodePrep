class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        # check if length of both strings are same
        if len(s) != len(t):
            return False
        # now create hashmaps to store the count of each character in the strings
        sHash = {}
        for c in s:
            if c in sHash:
                sHash[c] += 1
            else:
                sHash[c] = 1
        tHash = {}
        for c in t:
            if c in tHash:
                tHash[c] += 1
            else:
                tHash[c] = 1
        # verify if the character is in tHash or the value for the character count is same in both strings
        for i in s:
            if i not in tHash or sHash[i] != tHash[i]:
                return False
        return True
