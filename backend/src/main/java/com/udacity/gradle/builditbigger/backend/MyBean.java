package com.udacity.gradle.builditbigger.backend;

import com.uproject.shola.myjavalibrary.JokeSupply;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {

        myData = new JokeSupply().tellJoke();
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }
}


