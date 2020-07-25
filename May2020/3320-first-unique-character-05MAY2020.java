/************************************************************
PROBLEM STATEMENT
************************************************************/

/************************************************************
Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode"
return 2.
 

Note: You may assume the string contains only lowercase English letters.
************************************************************/

class Solution {
    public int firstUniqChar(String s) {
        int arr[] = new int[26];
        for(int i=0; i<s.length(); i++) {
            char d = s.charAt(i);
            arr[d-'a']++;
        }
        int index=-1;
        for(int i=0; i<s.length(); i++) {
            if (arr[s.charAt(i)-'a'] == 1) {
                index=i;
                break;
            }
        }
        return index;
    }
}