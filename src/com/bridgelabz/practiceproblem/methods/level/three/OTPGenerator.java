package com.bridgelabz.practiceproblem.methods.level.three;
//Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same
//Hint => 
//Write a method to Generate a 6-digit OTP number using Math.random() 
//Create an array to save the OTP numbers generated 10 times
//Write a method to ensure that the OTP numbers generated are unique. If unique return true else return false

public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static String generateOTP() {
        int otp = (int) (Math.random() * 900000) + 100000; // Ensures a 6-digit number
        return String.valueOf(otp);
    }

    // Method to check uniqueness of OTPs generated
    public static boolean areUniqueOTPs(String[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i].equals(otps[j])) {
                    return false; // Duplicate found
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] otpArray = new String[10];

        // Generate 10 OTPs
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otpArray[i]);
        }

        // Check uniqueness of the OTPs
        boolean unique = areUniqueOTPs(otpArray);

        if (unique) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs detected. Please try again.");
        }
    }
}
