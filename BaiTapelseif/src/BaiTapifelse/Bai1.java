package BaiTapifelse;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		System.out.println("Mời bạn nhập tiền thuế");
		Scanner scanner = new Scanner(System.in);
		float tien = scanner.nextFloat();
		float tienthue;
		if (tien <= 10) {
			tienthue = tien;
		} else if (tien > 10 && tien <= 15) {
			tienthue = (float) (tien - tien * 0.1);
		} else if (tien <= 15 && tien > 30) {
			tienthue = (float) (tien - tien * 0.2);
		} else {
			tienthue = (float) (tien - tien * 0.3);
		}
		System.out.println("Số tiền bạn nhận đc là :" + tienthue);
	}
}
