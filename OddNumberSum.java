package HW_Day5;

public class OddNumberSum {
	public static void main(String[] args) {
        int number = 1;
        int sum = 0;

        while (number <= 10) {
            sum += number;
            number += 2;
        }

        System.out.println("Sum of odd numbers from 1 to 10: " + sum);
    }

}
