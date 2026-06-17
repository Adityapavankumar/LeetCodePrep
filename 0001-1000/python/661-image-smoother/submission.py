class Solution(object):
    def imageSmoother(self, img):
        """
        :type img: List[List[int]]
        :rtype: List[List[int]]
        """
        # iterate through rows, columns
        # check for neighbours
        # average of every neighbour surrounding
        numRows = len(img) # length of main list
        numCols = len(img[0]) # length of sub list
        ans = [[0] * numCols for _ in range(numRows)]
        for i in range(numRows):
            for j in range(numCols):
                count = 0
                summ = 0
                for x in range(max(0,i-1), min(numRows, i + 2)):
                    for y in range(max(0, j-1), min(numCols, j+2)):
                        summ += img[x][y]
                        count += 1
                ans[i][j] = summ/count
        return ans
