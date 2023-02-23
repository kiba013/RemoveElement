public class Solution {
    public static int removeElement(int[] nums, int val) {
        int number = 0;
        for(int i = 0; i < nums.length; i++) {
            if(val == nums[i]) {
                continue;
            }
            nums[number] = nums[i];
            number +=1;
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }
}
