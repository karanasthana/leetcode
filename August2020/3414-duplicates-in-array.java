/************************************************************
PROBLEM STATEMENT
************************************************************/

/************************************************************
Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements that appear twice in this array.

Could you do it without extra space and in O(n) runtime?

Example:
Input:
[4,3,2,7,8,2,3,1]
Output:
[2,3]
************************************************************/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Boolean> freqCount = new HashMap<Integer, Boolean>();
        List<Integer> duplicates = new ArrayList<Integer>();
        
        for(int i=0; i<nums.length; i++) {
            int num = nums[i];
            // System.out.println(num + " and " + freqCount.get(num));
            if (freqCount.get(num) == null || freqCount.get(num) == false) {
                freqCount.put(num, true);
            } else {
                duplicates.add(num);
            }
        }
        
        return duplicates;
    }
}