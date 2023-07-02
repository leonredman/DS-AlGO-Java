import java.util.HashSet;

// Brute Force Solution:
// start with each element in the array  and loop thru and try to find the duplicate
// start with first element and traverse thru. Then the second element etc.
// If you dont find one, you return false.
// The time complexity is bad 'O(n)squared' as it takes alot of time over large arrays.
  
class Solution {
  public boolean containsDuplicate(int[] nums) {
    for(int i = 0; i < nums.length;i++) {
    for (int j = i+1; j < nums.length; j++){
    if( nums[i] == nums[j]) {
      return true;
    }
   }
  }
  return false;
 }
}


// Optimal Solution using HashSet
// Hash Set does not have any duplicate values
// we loop thru the array and check if the HashSet "contains" the value of the array at the index i
// then we can return true;
// otherwise we simply add the value to the HashSet
// else if the values are not present after going through all the elements of the array simply return false
// Time Complexity is O(n) as we do one loop

class Solution {
  public boolean containsDuplicate(int[] nums) {
      HashSet<Integer> numbers = new HashSet<>();

      for(int i = 0; i < nums.length; i++){
        if(numbers.contains(nums[i]))
        return true;
        numbers.add(nums[i]);
      }
      return false;
  }
}