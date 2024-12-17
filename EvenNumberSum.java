package HW_Day5;

public class EvenNumberSum {
	public static void main(String[] args) {
        int number = 2;
        int sum = 0;

        while (number <= 10) {
            sum += number;
            number += 2;
        }

        System.out.println("Sum of even numbers from 1 to 10: " + sum);
    }

}
