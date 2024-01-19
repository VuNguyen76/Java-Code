package BaiTap;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập cạnh của khối lập phương:");
		float canh = scanner.nextFloat();
		double thetich = Math.pow(canh, 3);
		System.out.println("Thể tích của khối lập phương là :" + thetich);
		scanner.close();
	}
}
