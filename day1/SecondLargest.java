package week2.day1;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};

		
		for (int i = 0; i < data.length; i++) {
		
			Arrays.sort(data);
		}
		System.out.println(data[data.length-2]);
	}

}
