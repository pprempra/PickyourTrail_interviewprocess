import java.time.chrono.MinguoChronology;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Question1 {

	static int replace(HashMap duplicate, int[] arr, ArrayList nonduplicate) {
		duplicate.forEach((k, v) -> {
			boolean replace = false;
			int value = (int) v;
			while (replace == false) {
				if (nonduplicate.contains(value)) {
					value++;
				} else {
					nonduplicate.add((int) value);
					arr[(int) k] = (int) value;
					replace = true;
				}
			}
		});

		Arrays.stream(arr).forEach(p->System.out.println(p));
		int sum = Arrays.stream(arr).sum();
		return sum;
	}

	static int minsum(int[] arr) {

		ArrayList nonduplicate = new ArrayList();
		HashMap duplicate = new HashMap();

		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				nonduplicate.add(arr[i]);
				continue;
			}
			if (nonduplicate.contains(arr[i])) {
				duplicate.put(i, arr[i]);
			} else {
				nonduplicate.add(arr[i]);
			}
		}

		int sum = replace(duplicate, arr, nonduplicate);
		return sum;
	}

	public static void main(String[] args) {
		int arr[] = {3,1,1,2,2,5};

		int sue = minsum(arr);
		System.out.println(sue);

	}
}
