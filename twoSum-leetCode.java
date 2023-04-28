// twosum leet code - java
// brute force solution is 2 nested for loops

class Solution {
  public int[] twoSum(int [] nums, int target) {

    for (int i = 0; i < nums, int target; i++) {
      for(int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[]{i, j};
        }
      }
    }
      return nums;
  }
}

// better solution is hashmap with linear look up time

class Solution{
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();         // stores integer (key, value) pair
      for (int i = 0; i < nums.length; i++) {                 // loop fills out the hashmap
        map.put(nums[i], i)                                   // stores index and value
    }

    for (int i = 0; i < nums.length; i++) {

      int difference = target - nums[i];

       if(map.containsKey(difference) && map.get(difference) ! = i) {           // check to see if values plus hashmap value adds to target
          return new int[] {map.get(difference), i};
      }
    }

    return nums;
  }
}