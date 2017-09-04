package com.example.android.favouritetoys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO (1) Declare a TextView variable called mToysListTextView

    private TextView mToysListTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO (3) Use findViewById to get a reference to the TextView from the layout

        // TODO (4) Use the static ToyBox.getToyNames method and store the names in a String array

        // TODO (5) Loop through each toy and append the name to the TextView (add \n for spacing)


        mToysListTextView = (TextView)findViewById(R.id.tv_toy_names);

        String [] toyNames = ToyBox.getToyNames();

        for (String toyName : toyNames){
            mToysListTextView.append(toyName + "\n\n\n");
        }


    }

}
