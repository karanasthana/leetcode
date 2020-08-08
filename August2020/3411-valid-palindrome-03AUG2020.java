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

class MyHashSet {

    /** Initialize your data structure here. */
    ArrayList<Integer> myList;

    public MyHashSet() {
        myList = new ArrayList<Integer>();
    }
    
    public void add(int key) {
        if (myList.contains(key)) {
            return;
        }
        myList.add(key);
    }
    
    public void remove(int key) {
        myList.remove(new Integer(key));
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return myList.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */