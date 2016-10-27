package homework5;

import java.util.*;

public class DiamondStars {
	Scanner s = new Scanner(System.in);
	int num;
	String queqe;

	void input() {
		do {
			this.queqe = " ";
			System.out.println("다이아 몬드 크기 입력(q입력하면 리스트로): ");
			if (s.hasNextInt()) {
				num = s.nextInt();
				if (num % 2 != 0) {
					for (int j = 1; j <= num; j = j + 2) {
						for (int i = num; i >= j; i = i - 2) {
							System.out.print(" ");
						}
						for (int k = 1; k <= j; k++) {
							System.out.print("*");
						}
						System.out.println();
					}
					for (int j = 1; j <= num - 2; j = j + 2) {
						for (int i = 1; i <= j; i = i + 2) {
							System.out.print(" ");
						}
						System.out.print(" ");
						for (int k = num - 2; k >= j; k--) {
							System.out.print("*");
						}
						System.out.println();
					}
				} else
					print();
			} else {
				this.queqe = s.next();
			}
		} while (!queqe.equals("q"));

	}

	void print() {
		System.out.println("잘못입력하셨습니다.");
	}
}