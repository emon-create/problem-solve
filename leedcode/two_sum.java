//! input case[2,7,11,15]
//! output case target 9;
import java.util.HashMap;

class two_sum{
    public int[] twoSum(int []nums,int target){
        //create a HashMap to store the number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        //Iterate over the array
        for(int i = 0;i<nums.length;i++){
            int complement = target - nums[i];

            //Check if the complement is already in the HasMap
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }

            //Otherwise, store the current number and its index in the map
            map.put(nums[i],i);
        }

        throw new IllegalArgumentException("No two sum soluation");
    }

    public static void main(String[] args) {
        two_sum solution = new two_sum();
        
        int[] nums = {2, 7, 11, 15}; // input array
        int target = 9; // target sum
        
        try {
            int[] result = solution.twoSum(nums, target);
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
