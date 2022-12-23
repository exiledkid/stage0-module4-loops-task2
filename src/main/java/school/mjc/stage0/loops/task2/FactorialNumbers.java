package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {

        int x = 0;
        int y = 1;
        int factorial = 1;

        while (x <= printToInclusive) {
            while (y <= x) {
                factorial = factorial * y;
                y++;
            }
            y = 1;
            System.out.println(factorial);
            factorial = 1;
            x++;
        }
    }
}
