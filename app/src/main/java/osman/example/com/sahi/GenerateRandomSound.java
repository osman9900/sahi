package osman.example.com.sahi;

import java.util.Random;

/**
 * Created by osman on 3/25/2016.
 */
public class GenerateRandomSound {
    private static GenerateRandomSound ourInstance = new GenerateRandomSound();

    private GenerateRandomSound() {

    }

    public static GenerateRandomSound getInstance() {
        return ourInstance;
    }

    private int randomNumber() {
        Random random = new Random();
        int randomNumber=random.nextInt(3);
        if (randomNumber < 0) {
            randomNumber = -randomNumber;
        }
        return randomNumber ;
    }

    public void randomSound(){

    }

}
