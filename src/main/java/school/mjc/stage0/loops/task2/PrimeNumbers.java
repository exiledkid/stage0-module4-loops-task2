package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {

        int counter = 2;

        while (counter < printToInclusive) {
            boolean isPrime = true;
            int counter2 = 2;

            while (counter2 < counter) {

                if (counter % counter2 == 0) {
                    isPrime = false;
                    break;
                }
                counter2++;
            }

            if (isPrime) {
                System.out.println(counter);
            }
            counter++;
        }

    }
}
