package com.example.madlibapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendInfo (View v)
    {
        // getting a reference to my edit text fields
        EditText adjective = (EditText) findViewById(R.id.adjective);
        EditText noun = (EditText) findViewById(R.id.noun);
        EditText verb = (EditText) findViewById(R.id.verb);
        EditText animal = (EditText) findViewById(R.id.animal);
        EditText place = (EditText) findViewById(R.id.place);
        EditText color = (EditText) findViewById(R.id.color);
        EditText number = (EditText) findViewById(R.id.number);
        EditText name = (EditText) findViewById(R.id.name);

        // extracting the text from those edit text fields
        String adjectiveStr = adjective.getText().toString();
        String nounStr = noun.getText().toString();
        String verbStr = verb.getText().toString();
        String animalStr = animal.getText().toString();
        String placeStr = place.getText().toString();
        String colorStr = color.getText().toString();
        String numberStr = number.getText().toString();
        String nameStr = name.getText().toString();

        // Creating the intent object so I can send data
        Intent intent = new Intent(this,StoryActivity.class);

        // putting data from edit text fields into intent to send to other activity
        // MY_NAME and MY_AGE are constants in the InfoActivity class
        intent.putExtra(StoryActivity.MY_ADJECTIVE, adjectiveStr);
        intent.putExtra(StoryActivity.MY_NOUN, nounStr);
        intent.putExtra(StoryActivity.MY_VERB, verbStr);
        intent.putExtra(StoryActivity.MY_ANIMAL, animalStr);
        intent.putExtra(StoryActivity.MY_PLACE, placeStr);
        intent.putExtra(StoryActivity.MY_COLOR, colorStr);
        intent.putExtra(StoryActivity.MY_NUMBER, numberStr);
        intent.putExtra(StoryActivity.MY_NAME, nameStr);

        // loads the next activity
        startActivity(intent);
    }
}
