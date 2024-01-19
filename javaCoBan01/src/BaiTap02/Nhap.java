package BaiTap02;

import java.util.Scanner;

public class Nhap {
	public static void main(String[] args) {
		SinhVien sv = new SinhVien();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập số lượng sinh viên :");
		int nums = scanner.nextInt();
		SinhVien[] danhSachsinhVien = new SinhVien[nums];
		
		for (int i = 0; i < nums; ++i) {
			System.out.println("Sinh viên thứ " + (i + 1));
			System.out.println("Mời bạn nhập mã sinh viên : ");
			danhSachsinhVien[i].mssv = scanner.nextInt();
			System.out.println("Mời bạn nhập tên sinh viên : ");
			danhSachsinhVien[i].name = scanner.next();
		}
		scanner.close();
	}
}
