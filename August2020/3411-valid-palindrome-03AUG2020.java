/************************************************************
PROBLEM STATEMENT
************************************************************/

/************************************************************
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:
Input: "A man, a plan, a canal: Panama"
Output: true

Example 2:
Input: "race a car"
Output: false
 

Constraints:

s consists only of printable ASCII characters.
************************************************************/

class Solution {
    public boolean isPalindrome(String str) {
        int start=0;
        int end=str.length()-1;
        
        str = str.toLowerCase();
        
        while(start<end) {
            char s = str.charAt(start);
            char e = str.charAt(end);
            
            while (!isAlphaNumeric(s) && start<end) {
                start++;
                s = str.charAt(start);
            }
            
            while (!isAlphaNumeric(e) && start<end) {
                end--;
                e = str.charAt(end);
            }
            
            if (s == e) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        
        return true;
    }
    
    public boolean isAlphaNumeric(char a) {
        int ascii = (int)a;
        if ((ascii>=97 && ascii<=122) || (ascii>=48 && ascii<=57)) {
            return true;
        } 
        return false;
    }
}