from typing import List

class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        ar = nums1 + nums2
        ar.sort()
        n = len(ar)
        
        if n % 2 == 1:
            return ar[n // 2]
        else:
            return (ar[(n // 2) - 1] + ar[n // 2]) / 2.0

# Driver code
if __name__ == "__main__":
    nums1 = [1, 3]
    nums2 = [2]
    
    sol = Solution()
    median = sol.findMedianSortedArrays(nums1, nums2)
    print(f"The median of {nums1} and {nums2} is {median}")
