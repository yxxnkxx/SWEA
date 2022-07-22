package SWEA0722;

import java.util.Scanner;

public class SWEA_1954_달팽이숫자 {
	public int[][] dfs(int[][] nums, int i, int j, int snail, int N) {
		if (nums[i][j] == 0) {
			nums[i][j] = snail++;
			if (i < N - 1 && j < N - 1) {
				dfs(nums, i, j + 1, snail, N);
			} else if (i < N - 1 && j == N - 1) {
				dfs(nums, i + 1, j, snail, N);
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int[][] nums = new int[N][N];

		}
	}

}
