package BaiTap;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập số cữu chương:");
		int choice = scanner.nextInt();
		for (int i = 0; i <= 10; ++i) {
			System.out.printf("%d x %d = %d\n", choice, i, choice * i);
		}
		scanner.close();
	}
}
