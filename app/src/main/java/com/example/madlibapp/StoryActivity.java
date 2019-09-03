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

        strToDisplay = "Once upon a time, in a(n) " + myAdjective + " city, a(n) " + myNoun + " lived in a(n) " + myPlace + ". The " + myNoun + " decided one day to get a pet. The "
                + myNoun + " thought that a(n) " + myAnimal + " would be a great pet! In the " + myAdjective + " city, " + myNoun + " " + myVerb +  " to a pet store selling interesting looking pets. " +
                "There were colors of all kinds but " + myNoun + " decided to choose the " + myColor + " " + myAnimal + ". What was most interesting of all was that the "
                + myColor + " " + myAnimal + " had " + myNumber + " hearts. The " + myNoun + " decided to name the " + myColor + " " + myAnimal + ", " + myName + ". The " + myNoun + " and " + myName +
            " lived happily ever after in the " + myAdjective + " city."
        ;
        TextView str = (TextView) findViewById(R.id.story);
        str.setText(strToDisplay);
    }

    public void shareInfo (View v)
    {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, strToDisplay);
        String chooserTitle = "Choose an app to send to";
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);
    }
}
