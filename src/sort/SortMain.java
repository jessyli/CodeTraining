package sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import sort.impl.BubbleSort;

public class SortMain {
	public static final int size = 1000;
	
	public static void main(String[] args) {
		Random rand = new Random();
		List<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			array.add(rand.nextInt());
		}

		Sorter sorter = new BubbleSort();

		sorter.sort(array);
		
		boolean ordered = true;
		for(int i=0; i<array.size()-1; i++) {
			if(array.get(i) > array.get(i+1)) {
				ordered = false;
				break;
			}
		}
		
		System.out.println(ordered);
	}
}
