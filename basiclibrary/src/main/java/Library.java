import java.util.ArrayList;
import java.util.Random;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Library {
    public static void main(String[] args) {
        String greeting = "Welcome to my Java program.";
        System.out.println(greeting);

        roll(3);
        containsDuplicates();
        calculatingAverages();
        arraysOfArrays();
    }

    public static void roll(int num) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            listOfNumbers.add(getRandomNumberInRange(1, 6));
        }
        System.out.println(listOfNumbers);
    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static void containsDuplicates() {
        ArrayList<Integer> listOfRandomNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listOfRandomNumbers.add(getRandomNumberInRange(1, 10));
            System.out.println(listOfRandomNumbers.get(i));

        }
        for (int i = 0; i < listOfRandomNumbers.size(); i++) {
            int x = listOfRandomNumbers.get(i);
            int j = i + 1;
            System.out.println("listOfRandomNumbers.get(i)");
            System.out.println(listOfRandomNumbers.get(i));
            System.out.println("listOfRandomNumbers.get(j)");
            System.out.println(listOfRandomNumbers.get(j));
            if (listOfRandomNumbers.get(i) == listOfRandomNumbers.get(j)) {
                System.out.println("true");
                i = 10;
            } else {
                System.out.println("false");
            }
        }
    }

    public static void calculatingAverages() {
        ArrayList<Integer> listOfRandomNumbersAndGetTHeAvg = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listOfRandomNumbersAndGetTHeAvg.add(getRandomNumberInRange(1, 10));
        }
        int x = 0;
        for (int i = 0; i < listOfRandomNumbersAndGetTHeAvg.size(); i++) {

            x = x + listOfRandomNumbersAndGetTHeAvg.get(i);
        }
        System.out.println("sum  " + x);
        System.out.println("avg  " + x / listOfRandomNumbersAndGetTHeAvg.size());
    }

    public static void arraysOfArrays() {
            ArrayList<ArrayList<Integer>> mainArray = new ArrayList<>();
            for(int i=0; i < 4; i++) {
                mainArray.add(new ArrayList());
            }
            for (int k = 0; k < 4; k++) {
                for (int i = 0; i < 10; i++) {
                    mainArray.get(k).add(getRandomNumberInRange(1, 10));
                }
            }
                System.out.println(mainArray);
            float x = 0;
        for (int z = 0; z <4; z++) {

            for (int i = 0; i < 10; i++) {
                x = x + mainArray.get(z).get(i);
            }
            System.out.println("sum  " + x);
            System.out.println("avg  " +  (x / 10));
            x=0;
        }
//        System.out.println(mainArray.get(1).get(0));


    }
}

