package com.theironyard.contactsandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ListView list;
    EditText name;
    EditText phoneNumber;
    Button add;
    ArrayAdapter<String> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);
        name = (EditText) findViewById(R.id.name);
        phoneNumber = (EditText) findViewById(R.id.number);
        add = (Button) findViewById(R.id.button);

        add.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String contactName = name.getText().toString();
        String contactNumber = phoneNumber.getText().toString();
        Contact contact = new Contact(contactName, contactNumber);
        contacts.add(contactName + " (" + contactNumber + ")");

        name.setText("");
        phoneNumber.setText("");
    }
}
