package HW_Day5;

public class PrintOddNumbers {
    public static void main(String[] args) {
        int number = 521; 

        while (number >= 229) {
        	
            if (number % 2 != 0) {
                System.out.println(number);
            }
            number--; 
        }
    }
}