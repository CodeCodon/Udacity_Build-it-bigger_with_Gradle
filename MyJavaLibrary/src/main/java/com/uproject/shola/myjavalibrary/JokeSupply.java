package com.uproject.shola.myjavalibrary;

public class JokeSupply {
    private static String[] jokes = {
            "I predict that AI will predict a Happy New Year for you",
            "Why is beer never served at a math party? " + "\n" + "Because you can't drink and derive.",
            "What do you get if you divide the circumference of a jack-o-lantern by its diameter?" + "\n" + "Pumpkin Pi",
            "What is a bird's favorite type of math? " + "\n" + "Owl-gebra"
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
