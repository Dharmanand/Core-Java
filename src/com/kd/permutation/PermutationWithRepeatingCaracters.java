package com.kd.permutation;

public class PermutationWithRepeatingCaracters {

	static void permute(Object[] a, int k, PermuteCallback callback) {
		int n = a.length;

		int[] indexes = new int[k];
		int total = (int) Math.pow(n, k);

		Object[] snapshot = new Object[k];
		while (total-- > 0) {
			for (int i = 0; i < k; i++) {
				snapshot[i] = a[indexes[i]];
			}
			callback.handle(snapshot);

			for (int i = 0; i < k; i++) {
				if (indexes[i] >= n - 1) {
					indexes[i] = 0;
				} else {
					indexes[i]++;
					break;
				}
			}
		}
	}

	public static interface PermuteCallback {
		public void handle(Object[] snapshot);
	};

	public static void main(String[] args) {
		Object[] chars = { 'a', 'b', 'c', 'd' };
		PermuteCallback callback = new PermuteCallback() {

			@Override
			public void handle(Object[] snapshot) {
				for (int i = 0; i < snapshot.length; i++) {
					System.out.print(snapshot[i]);
				}
				System.out.println();
			}
		};
		permute(chars, 4, callback);
	}

}