package com.patternsearch;

public class KMPAlgorithm {

	private final int R;
	private int[][] dfa;
	private char[] pattern;

	public KMPAlgorithm(String pattern) {

		this.R = 256;
		this.pattern = pattern.toCharArray();
		int m = pattern.length();
		dfa = new int[R][m];

		// build dfa from pattern

		dfa[pattern.charAt(0)][0] = 1;
		for (int x = 0, j = 1; j < m; j++) {
			for (int c = 0; c < R; c++) {
				dfa[c][j] = dfa[c][x];
			}
			// set match case

			dfa[pattern.charAt(j)][j] = j + 1;
			x = dfa[pattern.charAt(j)][x];

		}
	}

	public void search(String text) {
		int m = pattern.length;
		int n = text.length();
		int i, j;

		for (i = 0, j = 0; i < n && j < m; i++) {
			j = dfa[text.charAt(i)][j];
		}

		if (j == m) {
			System.out.println("Pattern found at index " + (i - m));
		} else {
			System.out.println("Pattern not found");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "ABABDABACDABABCABAB";
		String pattern = "ABABCABAB";
		KMPAlgorithm kmp = new KMPAlgorithm(pattern);
		kmp.search(text);
	}

}