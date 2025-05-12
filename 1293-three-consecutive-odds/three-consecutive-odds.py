class Solution(object):
    def threeConsecutiveOdds(self, arr):
        i = 0
        n = len(arr)
        while i < n-2 :
            if arr[i] % 2 != 0 and arr[i+1] % 2 != 0 and arr[i+2] % 2 != 0 :
                return True
            i += 1
        return False
        