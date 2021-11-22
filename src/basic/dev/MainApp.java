package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Bài 12.1 Viết chương trình tính tổng các số từ 1 đến 100
		System.out.println(" Bai 12.1 ");
		int i;
		int tong = 0;
		for ( i = 0; i <= 100; i++) 
			tong += i;
		System.out.println(" Tong la : " + tong);
		System.out.println("------------------");
		
		//Bài 12.2 Viết chương trình nhập vào 1 số tự nhiên n.Tính tổng các số chia hết cho 3 bé hơn n
		System.out.println(" Bai 12.2");
		
		System.out.println("Nhap n");
		int n = sc.nextInt();
	    tong = 0;
		for ( i = 1; i < n; i++) {
			if (i % 3 == 0) {
			tong += i;
		}
		}
		System.out.println("Tong cac so chia het cho 3 va be hon n la: " + tong);
		System.out.println("-------------------");
		
		//Bài 12.3 Viết chương trình in ra 100 số Fibonacci đầu tiên
		System.out.println("Bai 12.3");
		int first = 1, last = 1;
		System.out.println(" Day 100 so Fibonacci dau tien la : ");
		
		for ( i = 0; i < 100; i++ ) {
			System.out.println(first+" ");
            int tongHaiSoTruoc = first + last;
            first = last;
            last = tongHaiSoTruoc;
		}
		System.out.println("-------------------");
		
		//Bài 12.4 Viết chương trình kiểm tra 1 số nguyên n có phải là số polinom, n nhập từ bàn phím
		System.out.println("Bai 12.4");
		     	

	}

}
