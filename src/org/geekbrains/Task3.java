package org.geekbrains;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Сделана дз");
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }

        }
        return k;

    }

}

