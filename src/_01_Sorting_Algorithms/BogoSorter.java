package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}

	/*
	 * Bogo sort is a joke sorting algorithm. It is considered the most
	 * inefficient sorting algorithm while still maintaining the possibility
	 * of eventually sorting data.
	 * 
	 * It works by following these steps:
	 * STEP 1. Is the array in order?
	 * if yes, finished; if no, go to step 2.
	 * STEP 2. Take two random elements in the array and swap them.
	 * STEP 3. Go back to step 1.
	 */
	@Override
	void sort(int[] array, SortingVisualizer display) {
		Random rand = new Random();
		boolean inOrder = true;
		
		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array.length - 1; k++) {
				if(array[k]>array[k+1]) {
					inOrder = false;
					int r1 = rand.nextInt(array.length);
					int r2 = rand.nextInt(array.length);
					int temp = array[r1];
					array[r1] = array[r2];
					array[r2] = temp;
				}
				display.updateDisplay();
			}
		}
		if(inOrder == true){

		}
	}
}
