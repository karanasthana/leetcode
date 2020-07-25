/************************************************************
PROBLEM STATEMENT
************************************************************/

/************************************************************
Given a positive integer num, output its complement number. The complement strategy is to flip the bits of its binary representation.

 

Example 1:

Input: num = 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
Example 2:

Input: num = 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
 

Constraints:

The given integer num is guaranteed to fit within the range of a 32-bit signed integer.
num >= 1
You could assume no leading zero bit in the integer’s binary representation.
This question is the same as 1009: https://leetcode.com/problems/complement-of-base-10-integer/
************************************************************/

class Solution {
    public int findComplement(int num) {
        String binNum = bin(num);
        String complement = getComplement(binNum);
        return toDecimal(complement);
    }
    
    public String bin(int num) {
        String binRev = "";
        while (num != 0) {
            binRev = binRev + (num%2);
            num = num/2;
        }
        StringBuilder input1 = new StringBuilder(); 
        // append a string into StringBuilder input1 
        input1.append(binRev); 
        // reverse StringBuilder input1 
        binRev = input1.reverse().toString(); 
        return binRev;
    }
    
    String getComplement(String number) {
        String complementString = "";
        for(int i=0; i<number.length(); i++) {
            if (number.charAt(i) == '1') {
                complementString = complementString + '0';
            } else {
                complementString = complementString + '1';
            }
        }
        return complementString;
    }
    
    public int toDecimal(String bin) {
        int number = 0;
        for(int i=bin.length()-1; i>=0; i--) {
            number = number + (int)(Math.pow(2, (bin.length()-1-i)) * (Integer.parseInt(bin.charAt(i)+"")));
        }
        return number;
    }
}