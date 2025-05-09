class Solution(object):
    def findClosest(self, x, y, z):
        ans1 = abs(z - x)
        ans2 = abs(z - y)

        if (ans1 < ans2):
            return 1
        if (ans2 < ans1):
            return 2
        return 0
        