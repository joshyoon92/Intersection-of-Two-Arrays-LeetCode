package com.company;
import java.util.*;

public class Main {

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> num1 = new HashSet<Integer>();
        HashSet<Integer> num2 = new HashSet<Integer>();
        for (int n1: nums1){
            num1.add(n1);
        }
        for (int n2: nums2){
            num2.add(n2);
        }
        num1.retainAll(num2);
        int[] s = new int[num1.size()];
        int index = 0;
        for (int n : num1){
            s[index++] = n;
        }
        return s;
    }
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] answer = intersection(nums1, nums2);
        System.out.println(Arrays.toString(answer));
    }
}
