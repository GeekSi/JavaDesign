package com.design.behavior.template;

public class MainSort {

	public static void main(String[] args) {
		int[] array = new int[]{2, 5, 3, 10, 1, 6};
		AbstractSort sort = new MaoPaoSort();
		sort.sort(array);
	}
}
