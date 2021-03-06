class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length/2];
        int moves = 0;
        for(int i: nums) moves += Math.abs(i - mid);
        return moves;
    }
}
