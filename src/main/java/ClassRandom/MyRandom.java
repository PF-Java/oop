package ClassRandom;

import java.util.Random;

public class MyRandom {
    Random random = new Random(1000);

    private int randomNumber() {
       return random.nextInt(100);
    }

    public void printRandomNumbers() {
        System.out.printf("STT \t RandomNumber\n");
        for (int i = 1; i <= 50; i++) {
            System.out.printf("%d \t\t %d\n", i, randomNumber());
        }
    }

}
