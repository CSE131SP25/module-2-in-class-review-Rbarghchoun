package review2;

public class E03Fibonacci {

	/*
	 * The fibonacci sequence is given as:
	 * 
	 * 0, 1, 1, 2, 3, 5, 8, 13, ...
	 * 
	 * Write a program to print the first 50 fibonacci
	 * numbers.
	 */
	public static void main(String[] args) {
		long last_num = 0;
		long first_num = 1;
		long cur_num = 0;

		System.out.println(last_num);
		System.out.println(first_num);

		for (int i = 0; i < 48; i++){
			cur_num = last_num + first_num;
			last_num = first_num;
			first_num = cur_num;
			System.out.println(cur_num);
		}
	}
}
