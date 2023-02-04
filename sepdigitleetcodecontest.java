class Solution {
    public int[] separateDigits(int[] nums) {

        int n = nums.length;
        String s = "";

        for (int i = 0; i < n; i++) {
            s += String.valueOf(nums[i]);
        }

        int arr[] = new int[s.length()];
        String[] str = s.split("");

        System.out.println(str);

        for (int i = 0; i < s.length(); i++) {
            arr[i] = Integer.valueOf(str[i]);
        }

        return arr;
    }
}