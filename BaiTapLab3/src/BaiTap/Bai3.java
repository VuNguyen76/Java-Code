package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
	public void Sort(int[] nums) {
		Arrays.sort(nums);
	}

	public int Min(int[] nums, int num) {
		int min = nums[0];
		for (int i = 0; i < num; ++i) {
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		return min;
	}

	public int Max(int[] nums, int num) {
		int max = nums[0];
		for (int i = 0; i < num; ++i) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Mời bạn nhập số phần tử :");
		int num = scanner.nextInt();
		int[] nums = new int[num];
		for (int i = 0; i < num; ++i) {
			System.out.println("Số thứ " + (i + 1));
			nums[i] = scanner.nextInt();
		}
		Bai3 bai3 = new Bai3();
		bai3.Sort(nums);
		System.out.println("Mảng sau khi sắp xếp là:");
		for (int i = 0; i < num; ++i) {
			System.out.print(nums[i] + ",");
		}
		System.out.println("\nSố lớn nhất là: " + bai3.Max(nums, num));
		System.out.println("Số nhỏ nhất là: " + bai3.Min(nums, num));
		scanner.close();
	}
}
