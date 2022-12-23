package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int x = 0;
        while (x < chars.length) {
            System.out.print(chars [x]);
            x++;
        }
    }
}
