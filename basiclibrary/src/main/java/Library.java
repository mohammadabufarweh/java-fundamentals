import java.sql.Array;
import java.util.*;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */


public class Library {
    public static void main(String[] args) {
        String greeting = "Welcome to my Java program.";
        System.out.println(greeting);
        System.out.println("lab 02 --------------------------------");

      int [] arr={1,1,3,4,5};
        roll(3);
        System.out.println(containsDuplicates(arr));
        calculatingAverages((arr));
        arraysOfArrays();


        System.out.println("lab 03 --------------------------------");
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        System.out.println(weatherData(weeklyMonthTemperatures));
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = tally(votes);
        System.out.println(winner + " received the most votes!");


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

    public static boolean containsDuplicates(int [] array) {
        boolean containsDuplicates=false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return containsDuplicates = true;
                }
            }
        }
       return containsDuplicates;
    }
    public static void calculatingAverages(int[] arr) {

        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            x ++;
        }
        System.out.println("avg  " + x / arr.length);
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
            System.out.println("avg  " +  (x / 10));
            x=0;
        }



    }
    public static String weatherData(int[][] arr){
        HashSet<Integer> uniqueTemp = new HashSet<>();
        int maximum = arr[0][1];
        int minimum = arr[0][0];
        String returnData="";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                uniqueTemp.add(arr[i][j]);
                if(maximum< arr[i][j]){
                    maximum = arr[i][j];
                }
                if(minimum> arr[i][j]){
                    minimum = arr[i][j];
                }
            }
        }

        System.out.println( "High: " + maximum  );
        System.out.println("Low: " + minimum );

        for (int i = minimum; i < maximum; i++) {
            if(!uniqueTemp.contains(i)){
                returnData = returnData +"Never saw temperature: " + i;
            }
        }
        return returnData;


    }
    public static String tally(List<String> vote){
        HashMap<String, Integer> vot = new HashMap<>();
        int count = 0;
        String name = "";
        for(String names : vote){
            vot.put(names, 0);
        }
        for(String names : vote){
            if(vot.get(names) > count){
                count = vot.get(names)+1;
                name = names;
            }
            else{
                vot.put(names,vot.get(names)+1);
            }
        }
        return name;
    }


}

