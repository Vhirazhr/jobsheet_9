import java.util.Scanner;

public class arrayAverageScore11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] score = new int[10];
        double total = 0;
        double average;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score " + (i + 1) + ": ");
            score[i] = input.nextInt();
            total += score[i];
        }

        average = total / score.length;

        System.out.println("The class average score is " + average);

    }
}
