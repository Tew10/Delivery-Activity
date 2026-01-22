package Matriz;

import java.util.Scanner;

public class deliveryActivity {

	public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner read = new Scanner(System.in);

        int numColumns;
        int numRows;

        float sum = 0;
        float average = 0;

        startProgram("***** Program to calculate the average of decimal numbers *****\n");

        System.out.println("Enter the number of Rows the user wants");
        numRows = read.nextInt();
        read.nextLine();

        System.out.println("Enter the number of Columns the user wants");
        numColumns = read.nextInt();
        read.nextLine();

        float[][] quantity = new float[numColumns][numRows];

        for (int i = 0; i < quantity.length; i++) {
            for (int j = 0; j < quantity.length; j++) {

                System.out.println("Enter the decimal numbers");
                quantity[i][j] = read.nextFloat();
                read.nextLine();

                sum = sum + quantity[i][j];

            }
        }

        for (int i = 0; i < quantity.length; i++) {
            for (int j = 0; j < quantity.length; j++) {

                System.out.println("All registered items: " + quantity[i][j]);

            }
        }

        average = sum / (numColumns + numRows);

        System.out.println("The sum value is: " + sum);

        System.out.println("The average value is: " + average);

        endProgram("Program ending...");

    }

    public static void startProgram(String programName) {

        System.out.println("***** Program to calculate the average of decimal numbers *****\n");

    }

    public static void endProgram(String endProgram) {

        System.out.println("\n Program ending...");

    }

}