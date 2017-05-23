package edu.purdue.rtenany.lab10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//package edu.purdue.username.lab10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;


public class ShakeModel {

    String[] messages = new String[8];
    ShakeView view;


    public ShakeModel(ShakeView view) {
        this.view = view;

        messages[0] = "Probably not";
        messages[1] = "Sorry cannot be understand at this moment";
        messages[2] = "Yes, definitely";
        messages[3] = "Unfortunately not";
        messages[4] = "Maybe in the future";
        messages[5] = "Don't count on it";
        messages[6] = "Try again later";
        messages[7] = "Probably";


    }

    public void displayMessage() {
        String rand  = (messages[new Random().nextInt(messages.length)]);
        System.out.println(rand);
        view.changeMessage(rand);

    }


}

