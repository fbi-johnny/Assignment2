package com.example.muhammadjohn.assn2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        TextView Name =(TextView) findViewById(R.id.Name);
        TextView Email =(TextView) findViewById(R.id.Email);
        TextView Contact = (TextView) findViewById(R.id.Contact);

        Name.setText(getIntent().getStringExtra("Name"));
        Email.setText(getIntent().getStringExtra("Email"));
        Contact.setText(getIntent().getStringExtra("Contact"));


    }
}
