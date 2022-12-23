package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {

        int x = 0;

        while (x <= power) {
            int answer = (int) Math.pow(2, x);
            x++;
            System.out.println(answer);
        }
        if (power < 0) {
            System.out.println("too much power");
        }
    }
}
