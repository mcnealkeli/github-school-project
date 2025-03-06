package com.github.school.project;

public class RandomCode {
    public static void main(String[] args) {
        System.out.println("The generated random number is " + generateRandomNumber());
    }

    private static int generateRandomNumber() {
        return (int) (Math.random() * 10);
    }
}