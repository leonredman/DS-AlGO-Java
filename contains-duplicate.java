import java.util.HashSet;

// we can use a HashSet
// we loop thru the array and check if the HashSet "contains" the value of the array at the index
// then we can return true
// otherwise we simply add the value to the HashSet
// if the values are not present after going through all the elements of the array simply return false
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