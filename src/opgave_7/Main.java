package opgave_7;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < 100; i++) {
            numbers[intRandom(0, 9)]++;
        }


        for (int i = 0; i < numbers.length; i++) {

            int finalI = i;
            int finalI1 = i;
            Stream.of(i).forEach(e -> System.out.println("Number " + finalI + " appears " + numbers[finalI1] + " times." ) );

        }

    }


    public static int intRandom(int lowerBound, int upperBound) {
        return (int) (lowerBound + Math.random()
                * (upperBound - lowerBound + 1));
    }

}

