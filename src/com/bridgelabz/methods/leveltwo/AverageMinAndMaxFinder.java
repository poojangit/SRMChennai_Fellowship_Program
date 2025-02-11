package com.bridgelabz.methods.leveltwo;

import java.util.Arrays;

public class AverageMinAndMaxFinder {
	  // Method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000; // Ensures 4-digit range (1000 to 9999)
        }
        return numbers;
    }

    // Method to find average, min, and max values of an array
    public double[] findAverageMinMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
    	AverageMinAndMaxFinder statistics = new AverageMinAndMaxFinder();

        // Generate five 4-digit random numbers
        int[] randomNumbers = statistics.generate4DigitRandomArray(5);
        System.out.println("Generated Random Numbers: " + Arrays.toString(randomNumbers));

        // Find and display average, min, and max values
        double[] results = statistics.findAverageMinMax(randomNumbers);
        System.out.printf("Average: %.2f, Min: %.0f, Max: %.0f%n", results[0], results[1], results[2]);
    }

}
