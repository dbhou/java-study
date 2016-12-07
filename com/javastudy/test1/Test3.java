package com.javastudy.test1;

public class Test3 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("==========================");

		int[] b = a;
		for (int i = 0; i < b.length; i++) {
			b[i]++;
			System.out.println(a[i]);
		}

		System.out.println("----------------------");

		for (int i : a) {
			System.out.println(i);
		}

		System.out.println("===========================");

		int[] a1 = new int[5];
		for (int i : a1) {
			System.out.println(i);
		}

		System.out.println("==========================");

		int[] a2 = new int[] { 1, 2, 3, 4, 5 };
		for (int i : a2) {
			System.out.println(i);
		}

		System.out.println("=============================");

		int[][] a3 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < a3.length; i++) {
			System.out.println("");
			for (int j = 0; j < a3[i].length; j++) {
				System.out.print(a3[i][j] + "  ");
			}
		}

		System.out.println("");
		System.out.println("==================================");

		int[][][] a4 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

		for (int i = 0; i < a4.length; i++) {
			System.out.println("");
			for (int j = 0; j < a4[i].length; j++) {
				System.out.println("");
				for (int k = 0; k < a4[i][j].length; k++) {
					System.out.print(a4[i][j][k]);
				}
			}
		}

		System.out.println("");
		System.out.println("数组测试结束！");

	}
}
