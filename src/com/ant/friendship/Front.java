package com.ant.friendship;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class Front extends Activity {

    private ListView LView;
    ArrayList <String>ar = new ArrayList<String>();

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        LView = (ListView) findViewById(R.id.ListView01);
        // Set option as Multiple Choice. So that user can able to select more
        // the one option
        final ArrayAdapter<String> adpt=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice, ar);
       // LView.setAdapter(adpt);
        LView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        Button b = (Button) findViewById(R.id.add_item);
        final EditText d = (EditText) findViewById(R.id.title);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ar.add(d.getText().toString());
               // adpt.setNotifyOnChange(true);
                LView.setAdapter(adpt);
            }
        });
    }
}


