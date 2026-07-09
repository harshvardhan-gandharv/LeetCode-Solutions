class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0 ; i <  n-2 ; i++){
            int curr = nums[i];
            
            if(curr > 0) break;

            int st = i+1;
            int end = n-1;

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            while(st<end){
                int sum = curr+ nums[st] + nums[end];
                if(sum == 0){
                    list.add(Arrays.asList(curr,nums[st],nums[end]));
                    st++;
                    end--;

                    //skip duplicates
                    while(st < end && nums[st] == nums[st-1]) st++;
                    while(st<end && nums[end] == nums[end+1]) end--;
                }
                else if(sum > 0){
                    end--;
                }
                else{
                    st++;
                }
            }
        }
        return list;
    }
}