package edu.purdue.rtenany.lab10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShakeView {

    TextView message;

    public ShakeView(TextView message) {
        this.message = message;
    }

    public void changeMessage(String message) {
       //this.message = message;
        this.message.setText(message);
    }



}
