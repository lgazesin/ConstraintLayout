package com.nexis.constraintlayoutlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userNameText, passwordText;
    RadioButton catButton, dogButton;
    CheckBox checkBox;
    Button button;
    Switch aSwitch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userNameText = findViewById(R.id.editTextTextPersonName);
        passwordText = findViewById(R.id.editTextTextPassword);
        catButton = findViewById(R.id.catRadioButton);
        dogButton = findViewById(R.id.dogRadioButton);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        button = findViewById(R.id.button);
        aSwitch = findViewById(R.id.switch1);


        catButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Toast.makeText(MainActivity.this, "You are a cat person", Toast.LENGTH_LONG).show();
                }
            }
        });

        dogButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Toast.makeText(MainActivity.this, "Your are a dog person", Toast.LENGTH_LONG).show();
                }
            }
        });

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Toast.makeText(MainActivity.this, "You accept the spam emails", Toast.LENGTH_LONG).show();
                } else
                    Toast.makeText(MainActivity.this, "You didn't accept the spam emails", Toast.LENGTH_LONG).show();
            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (checkBox.isChecked()) {
                    Toast.makeText(MainActivity.this, "You accept the licence agreement", Toast.LENGTH_LONG).show();
                }
                if (!checkBox.isChecked()) {
                    Toast.makeText(MainActivity.this, "You didn't accept the licence agreement", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    public void displayInfo(View view) {
        String nameString = userNameText.getText().toString();
        String passwordString = passwordText.getText().toString();
        Toast.makeText(getApplicationContext(), "Your username is:" + nameString + "\n" + "Your password is:" + passwordString, Toast.LENGTH_LONG).show();

    }
}
