import java.util.Scanner;

class Array {
	public static void main(String[] args) {
		int i, num, min = 0, max = 0, sum = 0;
		int[] array;
		Scanner entry = new Scanner(System.in);

		System.out.println("Digite quantos elementos o array deverá ter:");
		num = entry.nextInt();

		array = new int[num];

		for(i = 0; i < array.length; i++) {
			System.out.print("["+i+"]: ");
			num = entry.nextInt();
			array[i] = num;

			if (i == 0) {
				min = max = num;
			} else {
				if (num > max) {
					max = num;
				}
				if (num < min) {
					min = num;
				}
			}
		}

		for(i = 0, sum = 0; i < array.length; i++) {
			if (array[i] == min) {
				System.out.print(array[i] + " [menor], ");
			} else if (array[i] == max) {
				System.out.print(array[i] + " [maior], ");
			} else {
				System.out.print(array[i] + ", ");
			}
			sum += num;
		}
		System.out.println();

		System.out.println("Soma: " + sum);
	}
}