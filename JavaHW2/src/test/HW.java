package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class HW {
	public static void main (String[] args) {
		
		int[] nums = {-1,0,1,2,-1,-4};
		int[] nums2 = {0};
		
		int[] height = {1,8,6,2,5,4,8,3,7};
		int[] height2 = {1, 1};
		ArrayList<Integer> heights = new ArrayList<Integer>();
		heights.add(1);
		heights.add(8);
		heights.add(6);
		heights.add(2);
		heights.add(5);
		heights.add(4);
		heights.add(8);
		heights.add(3);
		heights.add(7);
		
		ArrayList<Human> people = new ArrayList<>();
		people.add(new Toddler());
		people.add(new Child());
		people.add(new Adult());
		
			
		System.out.println("task 1 ---------------------------------------------------");
		System.out.println("1st example");
		ArrayList<ArrayList<Integer>> tripletsList = arrSum(nums);
			System.out.println(tripletsList);
			
		System.out.println("2nd example");
		tripletsList=arrSum(nums2);
			System.out.println(tripletsList);
		
		
		System.out.println("task 2 ---------------------------------------------------");
		
		System.out.println("1st example");
		int maxArea = maxWater(height);
		System.out.println("The max area of water that can be contained is: " + maxArea);
		
		System.out.println("2nd example");
		maxArea = maxWater(height2);
		System.out.println("The max area of water that can be contained is: " + maxArea);
		
//		ad-hoc polimorfizmo pavyzdys, per parametrus perduodama arba array, arba array list;
		maxArea = maxWater(heights);
		System.out.println("The max area of water that can be contained is: " + maxArea);
		
//		parametric polimorfizmo pavyzdys
		for (Human person:people) {
			System.out.println(person.does());
		}
	}
				

private static ArrayList<ArrayList<Integer>> arrSum(int[] nums) {
	ArrayList<ArrayList<Integer>> listTriplets = new ArrayList<ArrayList<Integer>>();
	
	for (int i = 0; i < nums.length; i++) {
		for (int j = i + 1; j < nums.length; j++) {
			for (int k = j + 1; k < nums.length; k++) {
				if(nums[i] + nums[j] + nums[k] == 0) {
					ArrayList<Integer> triplet = new ArrayList<Integer>();
					triplet.add(nums[i]);
					triplet.add(nums[j]);
					triplet.add(nums[k]);
					Collections.sort(triplet);
					listTriplets.add(triplet);
				}
			}
		}
	}
	listTriplets = new ArrayList<ArrayList<Integer>>(new LinkedHashSet<ArrayList <Integer>>(listTriplets));
	return listTriplets;
}

private static int maxWater(int[] heights) {
	int maxAmount = 0;
	int start = 0;
	int end = heights.length - 1;
	
	while(start < end) {
		int width = end - start;
		maxAmount = Math.max(maxAmount, Math.min(heights[start], heights[end]) * width);
		if(heights[start] >= heights[end]) {
			end--;
		}else {
			start++;
		}
	}	
	return maxAmount;
}

private static int maxWater(ArrayList<Integer> heights) {
	int maxAmount = 0;
	int start = 0;
	int end = heights.size() - 1;
	
	while(start < end) {
		int width = end - start;
		maxAmount = Math.max(maxAmount, Math.min(heights.get(start), heights.get(end)) * width);
		if(heights.get(start) >= heights.get(end)) {
			end--;
		}else {
			start++;
		}
}
	return maxAmount;
}
}



