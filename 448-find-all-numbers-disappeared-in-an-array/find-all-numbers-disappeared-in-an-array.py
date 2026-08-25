class Solution:
    def findDisappearedNumbers(self, nums):

        # Number of elements in the array
        n = len(nums)

        # Create a seen array of size n + 1.
        # Index 0 is unused.
        # Indexes 1 to n represent the numbers.
        seen = [False] * (n + 1)

        # Mark every number that appears in nums.
        for num in nums:
            seen[num] = True

        # Store missing numbers here.
        ans = []

        # Check every number from 1 to n.
        for i in range(1, n + 1):

            # If number i was never seen,
            # it is missing.
            if not seen[i]:
                ans.append(i)

        # Return the missing numbers.
        return ans