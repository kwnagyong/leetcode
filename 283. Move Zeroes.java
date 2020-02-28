class Solution {
    public void moveZeroes(int[] nums) {
        
        int pivot = 0;
        for(int i = 0 ; i < nums.length; i++) {
          if(nums[i] != 0) {
            swap(nums, i, pivot++);
          }
        }
    }
  
    public void swap(int[] nums, int i , int j ) {
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
    }
}
