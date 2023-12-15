class Solution(object):
    def destCity(self, paths):
        """
        :type paths: List[List[str]]
        :rtype: str
        """
        # first list out all the origins
        origins = []
        for path in paths:
            origins.append(path[0])
        
        # check if destination is orgin of another
        for path in paths:
            if path[1] not in origins:
                return path[1]
