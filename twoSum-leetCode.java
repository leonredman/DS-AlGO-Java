// twosum leet code - java
// Hashmap Tutorial https://www.youtube.com/watch?v=70qy6_gw1Hc

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

class Solution3 {
  public:
  vector<int> twoSum(vector<int> & nums, int target) {
    unordered_map <int,int> mymap;  //key, Value ---> Val, idx

  //Find the pair element by element
  for(int i = 0; i < nums.size(); ++i){
    if(mymap.count(target - nums[i]))
      return {i , mymap[target - nums[i]]};
      //Insert current element
      mymap[nums[i]] = i;
  }
  return{}; // no pairs
  }
};