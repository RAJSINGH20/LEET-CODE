class Solution {
    public void sortColors(int[] nums) {
        int length = nums.length;
        for(int i=0;i<length;i++){
            for(int j=0;j<length -1 -i;j++){
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}