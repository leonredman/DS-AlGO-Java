// twosum leet code - java
// Hashmap Tutorial https://www.youtube.com/watch?v=70qy6_gw1Hc

// brute force solution is 2 nested for loops
// https://www.youtube.com/watch?v=2iG04aXKBAQ&t=27s
import java.util.HashMap;

class Solution {
  public int[] twoSum(int [] nums, int target) {

    for (int i = 0; i < nums.length; i++) {
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

// create a new hashmap
// loop through index of the array
// map.put the index of the array and the value into the map
// loop through the array nums
// for each element in the array calculate the difference of the target - element of the array by index
// check if the map.containsKey (the value of difference) and get the difference not equal to i
// return a new array with type of int with map.get difference , i ( two values for solution)
// else return nums array

class Solution2{
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();         // stores integer (key, value) pair
      for (int i = 0; i < nums.length; i++) {                 // loop fills out the hashmap
        map.put(nums[i], i);                                   // stores index and value
    }

    for (int i = 0; i < nums.length; i++) {

      int difference = target - nums[i];

       if(map.containsKey(difference) && map.get(difference) != i) {           // check to see if values plus hashmap value adds to target
          return new int[] {map.get(difference), i};
      }
    }

    return nums;
  }
}

// another map solution as follows  https://www.youtube.com/watch?v=mhxQgCEfgQM
