package BaiTap;

import java.util.Scanner;

public class Bai1 {
	public int CheckNT(int n) {
		if (n < 2) {
			return -1;
		}
		int dem = 0;
		for (int i = 2; i <= n; ++i) {
			if (n % i == 0) {
				dem++;
			}
		}
		return dem;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập số nguyên n: ");
		int n = scanner.nextInt();
		Bai1 nguyento = new Bai1();
		int reuslt = nguyento.CheckNT(n);
		if (reuslt == -1) {
			System.out.println("Không phải số nguyên tố");
		} else if (reuslt == 0) {
			System.out.println("Không phải là số nguyên tố");
		} else {
			System.out.println("Là số nguyên tố");
		}
		scanner.close();
	}
}
