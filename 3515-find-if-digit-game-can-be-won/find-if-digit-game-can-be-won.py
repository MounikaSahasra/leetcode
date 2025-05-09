class Solution(object):
    def canAliceWin(self, nums):
        doubles = 0
        singles = 0
        for i in nums :
            if i < 10:
                singles += i
            else :
                doubles +=i

        return singles != doubles
        