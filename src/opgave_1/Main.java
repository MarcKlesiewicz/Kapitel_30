package opgave_1;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int n = input.nextInt();

        int[] score = new int[n];
        int bestScore = 0;

        System.out.println("Enter " + n + " scores:");

        for (int i = 0; i < score.length; i++) {
            score[i] = input.nextInt();
            if (bestScore < score[i]){
                bestScore = score[i];
            }

        }

        char grade;

        for (int i = 0; i < score.length ; i++) {
            if (score[i] >= bestScore - 5)
                grade = 'A';
            else if (score[i] >= bestScore - 10)
                grade = 'B';
            else if (score[i] >= bestScore - 15)
                grade = 'C';
            else if (score[i] >= bestScore - 20)
                grade = 'D';
            else
                grade = 'F';

            char finalGrade = grade;
            int finalI = i;
            int finalI1 = i;
            Stream.of(i).forEach(e -> System.out.println("Student " + finalI + " score is " + score[finalI1] + " and the grade is " + finalGrade));



        }


    }
}