class Solution {

  
  // brute force solution:
        // we would loop thru the array to get first number
        // we loop thru the array to get the second number which is the first number +1
        // we take the target number minus the second number and check if equals the first number
        // if true return the two numbers in a new array
        // Time complexity "O" of (n)Squared

  public int[] twoSum(int[] nums, int target) {
      // create new HashMap with 2 integers
      HashMap<Integer, Integer> numbers = new HashMap<>();
      // create a for loop and "put" integers index (nums[i]) and value (i) in hashMap 
      for (int i = 0; i < nums.length; i++) {
          numbers.put(nums[i], i);
      }

      // create for loop and declare a variable difference equal to the target  minus nums index
      for (int i = 0; i < nums.length; i++) {
          int difference = target - nums[i];
      // if HashMap .containsKey of the difference and we Hashmap.get the difference and they are not equal to i we return a new int with the hashmap.get difference, and the value i
          if(numbers.containsKey(difference) && numbers.get(difference) != i){
              return new int[] {numbers.get(difference), i};
          }
      }
      return nums;
  }
}