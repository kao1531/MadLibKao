package com.example.madlibapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {

    public static final String MY_ADJECTIVE = "adjective";
    public static final String MY_NOUN = "noun";
    public static final String MY_VERB = "verb";
    public static final String MY_COLOR = "color";
    public static final String MY_ANIMAL = "animal";
    public static final String MY_NUMBER = "number";
    public static final String MY_PLACE = "place";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();

        String myAdjective = intent.getStringExtra(MY_ADJECTIVE);
        String myNoun = intent.getStringExtra(MY_NOUN);
        String myVerb = intent.getStringExtra(MY_VERB);
        String myColor = intent.getStringExtra(MY_COLOR);
        String myAnimal = intent.getStringExtra(MY_ANIMAL);
        String myNumber = intent.getStringExtra(MY_NUMBER);
        String myPlace = intent.getStringExtra(MY_PLACE);

        String strToDisplay = "Story";
        TextView str = (TextView) findViewById(R.id.info);
        str.setText(strToDisplay);
    }
}
