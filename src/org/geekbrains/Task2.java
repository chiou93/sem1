package org.geekbrains;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Сделана дз");
    }
}

class Solution {
    public int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

}

