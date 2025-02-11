package com.bridgelabz.methods.levelthree;
import java.util.Random;
public class StudentScorecard {

    // Method to generate random scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int studentCount) {
        Random random = new Random();
        int[][] scores = new int[studentCount][3];

        for (int i = 0; i < studentCount; i++) {
            scores[i][0] = 40 + random.nextInt(61); // Physics score (between 40 and 100)
            scores[i][1] = 40 + random.nextInt(61); // Chemistry score (between 40 and 100)
            scores[i][2] = 40 + random.nextInt(61); // Math score (between 40 and 100)
        }

        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateStatistics(int[][] scores) {
        double[][] statistics = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = Math.round((total / 300.0) * 10000.0) / 100.0;

            statistics[i][0] = total;
            statistics[i][1] = average;
            statistics[i][2] = percentage;
        }

        return statistics;
    }

    // Method to calculate grades and remarks based on percentage
    public static String[][] calculateGrades(double[][] statistics) {
        String[][] grades = new String[statistics.length][2];

        for (int i = 0; i < statistics.length; i++) {
            double percentage = statistics[i][2];
            char grade;
            String remarks;

            if (percentage >= 80) {
                grade = 'A';
                remarks = "Level 4, above agency-normalized standards";
            } else if (percentage >= 70) {
                grade = 'B';
                remarks = "Level 3, at agency-normalized standards";
            } else if (percentage >= 60) {
                grade = 'C';
                remarks = "Level 2, below but approaching agency-normalized standards";
            } else if (percentage >= 50) {
                grade = 'D';
                remarks = "Level 1, well below agency-normalized standards";
            } else if (percentage >= 40) {
                grade = 'E';
                remarks = "Level 1-, too below agency-normalized standards";
            } else {
                grade = 'R';
                remarks = "Remedial standards";
            }

            grades[i][0] = String.valueOf(grade);
            grades[i][1] = remarks;
        }

        return grades;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] statistics, String[][] grades) {
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10s %20s\n", 
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "%", "Grade", "Remarks");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%10d %10d %10d %10d %10.0f %10.2f %10.2f %10s %20s\n", 
                (i + 1), scores[i][0], scores[i][1], scores[i][2], 
                statistics[i][0], statistics[i][1], statistics[i][2], grades[i][0], grades[i][1]);
        }
    }

    public static void main(String[] args) {
        final int STUDENT_COUNT = 10;

        // Generate random scores for students
        int[][] scores = generateScores(STUDENT_COUNT);

        // Calculate statistics
        double[][] statistics = calculateStatistics(scores);

        // Calculate grades and remarks
        String[][] grades = calculateGrades(statistics);

        // Display the scorecard
        displayScorecard(scores, statistics, grades);
    }
}
