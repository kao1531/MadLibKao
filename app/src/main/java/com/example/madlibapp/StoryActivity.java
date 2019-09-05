package com.example.madlibapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {

    public static final String MY_ADJECTIVE = "adjective";
    public static final String MY_NOUN = "noun";
    public static final String MY_VERB = "verb";
    public static final String MY_COLOR = "color";
    public static final String MY_ANIMAL = "animal";
    public static final String MY_NUMBER = "number";
    public static final String MY_PLACE = "place";
    public static final String MY_NAME = "name";
    String strToDisplay;


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
        String myName = intent.getStringExtra(MY_NAME);

        strToDisplay = "Once upon a time, in a(n) " + myAdjective.toUpperCase() + " city, a(n) " + myNoun.toUpperCase() + " lived in a(n) " + myPlace.toUpperCase()
                + ". The " + myNoun.toUpperCase() + " decided one day to get a pet. The " + myNoun.toUpperCase() + " thought that a(n) " + myAnimal.toUpperCase()
                + " would be a great pet! In the " + myAdjective.toUpperCase() + " city, " + myNoun.toUpperCase() + " " + myVerb.toUpperCase() +
                "(ed) to a pet store selling interesting looking pets. " + "There were colors of all kinds but " + myNoun.toUpperCase() + " decided to choose the "
                + myColor.toUpperCase() + " " + myAnimal.toUpperCase() + ". What was most interesting of all was that the " + myColor.toUpperCase() + " "
                + myAnimal.toUpperCase() + " had " + myNumber.toUpperCase() + " hearts. The " + myNoun.toUpperCase() + " decided to name the " + myColor.toUpperCase()
                + " " + myAnimal.toUpperCase() + ", " + myName.toUpperCase() + ". The " + myNoun.toUpperCase() + " and " + myName.toUpperCase() +
                " lived happily ever after in the " + myAdjective.toUpperCase()+ " city.";
        TextView str = (TextView) findViewById(R.id.story);
        str.setText(strToDisplay);
    }

    public void shareInfo (View v)
    {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, strToDisplay);
        String chooserTitle = "Choose an app to send your message";
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);
    }

}
