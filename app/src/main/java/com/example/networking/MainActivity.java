package com.example.networking;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "HTTPS_URL_TO_JSON_DATA_CHANGE_THIS_URL";
    private final String JSON_FILE = "mountains.json";

    private RecyclerView resView;
    private RecyclerViewAdapter resViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList Mountains = new ArrayList<>(Arrays.asList(
            new Mountain("Billigen"),
            new Mountain("Mount Everest"),
            new Mountain("Uluru")
        ));

        resView = findViewById(R.id.recycler_view);
        resView.setLayoutManager(new LinearLayoutManager(this));

        new JsonFile(this, this).execute(JSON_FILE);
    }

    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);
    }

}
