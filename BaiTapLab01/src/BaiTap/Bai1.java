package BaiTap;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Moi ban nhap ten: ");
		String name = scanner.nextLine();

		System.out.print("Moi ban nhap tuoi: ");
		int age = scanner.nextInt();

		System.out.println("Tên sinh viên: " + name);
		System.out.println("Bao nhiêu tuổi: " + age);

		scanner.close();
	}
}
