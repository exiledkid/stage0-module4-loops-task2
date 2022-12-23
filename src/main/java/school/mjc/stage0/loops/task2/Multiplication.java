package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {

        int x = 0;

        if (multiplyByAndToInclusive > 0) {
            while (x <= multiplyByAndToInclusive) {
                int answer = multiplyByAndToInclusive * x;
                System.out.println(answer);
                x++;
            }

        } else if (multiplyByAndToInclusive < 0) {
            while (x >= multiplyByAndToInclusive) {
                int answer = multiplyByAndToInclusive * -x;
                System.out.println(answer);
                x--;
            }
        }
    }
}
