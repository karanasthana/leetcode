/************************************************************
PROBLEM STATEMENT
************************************************************/

/************************************************************
Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:
    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    ...

Example 1:
Input: "A"
Output: 1
Example 2:

Input: "AB"
Output: 28
Example 3:

Input: "ZY"
Output: 701

Constraints:

1 <= s.length <= 7
s consists only of uppercase English letters.
s is between "A" and "FXSHRXW".
************************************************************/

class Solution {
    public int titleToNumber(String s) {
        int length = s.length();
        double out = 0;
        for(int i=length-1; i>=0; i--) {
            char d = s.charAt(i);
            int index = d - 'A' + 1;
            out = out + (index * Math.pow(26,length-1-i));
        }
        return (int)out;
    }
}