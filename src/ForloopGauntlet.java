
public class ForloopGauntlet {
	public static void main(String[] args) {
		// 1. Display all numbers from 0 to 100
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		// 2. Display all numbers from 100 to 0
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
		// 3. Display all even numbers from 2 to 100
		for (int i = 2; i <= 100; i += 2) {
			System.out.println(i);
		}
		// 4. Display all odd numbers from 1 to 99
		for (int i = 1; i <= 99; i += 2) {
			System.out.println(i);
		}
		// 5. Display all numbers from 1 to 500.
		// If the number is odd, print “odd” next to the number.
		// If the number is even, print “even” next to the number.
		for (int i = 1; i <= 500; i++) {

			if (i % 2 == 0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}

		}
		// 6. Display all multiples of 7 from 0 to 777.
		for (int i = 7; i <= 777; i += 7) {
			System.out.println(i);
		}
		// 7. Print all the years you were alive and how old you were in each.
		// e.g. “In 1979, i was 2 years old.” (for a really old person)
		for (int i = 2001; i <= 2019; i++) {
			System.out.println("In " + i + ", I was " + (i - 2001) + " years old.");
		}

		// Write nested for loops (a for loop inside another for loop) to do the
		// following:

		/*
Write nested for loops (a for loop inside another for loop) to do the following:

1. Display this output:


 		  0  0
          0  1
          0  2
          1  0
          1  1
          1  2
          2  0
          2  1
          2  2

*/
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.println(i + "  " + j);
			}
		}
		/* 2. Display the numbers 1 through 9 in a 3x3 square grid like this:
		  
		  1  2  3
          4  5  6
          7  8  9

		 */
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.print((i*3+j+1+" "));
			}
			System.out.println();
		}
		/*
		 * 3. Display the numbers 1 through 100 in a 10x10 square grid.
		 * 
		 */
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				System.out.print(i*10+j+1+ " ");
			}
			System.out.println();
		}
		/*
		 * 4. Display the following output:
		 * 
		  *
          *  *
          *  *  *
          *  *  *  *
          *  *  *  *  *
          *  *  *  *  *  *

		*/
		for (int i = 0; i <= 50; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	
}
