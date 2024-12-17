package HW_Day5;

public class PrintAlternateNumbers {
    public static void main(String[] args) {
        int number = 1;

        do {
            System.out.print(number + " ");
            number += 2;  
        } while (number <= 50);
    }
}
