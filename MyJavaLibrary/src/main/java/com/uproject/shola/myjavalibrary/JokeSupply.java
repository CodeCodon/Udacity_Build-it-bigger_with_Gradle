package com.uproject.shola.myjavalibrary;

public class JokeSupply {
    private static String[] jokes = {

    };

    /**
     * This class should not be instantiated
     */
    public JokeSupply(){}

    /**
     * Method that generates a random integer number for a given range
     * @param min Minimum number in range
     * @param max Maximum number in range
     * @return integer number between min and max range
     */
    private static int getRandomNumberInRange(int min, int max){
        return (int)(Math.random() * (max-min) + min);
    }

    /**
     * This method fetches randomly one of the available jokes
     * @return String containing a random joke
     */
    public static String tellJoke(){
        return jokes[getRandomNumberInRange(0, jokes.length-1)];
    }


}
