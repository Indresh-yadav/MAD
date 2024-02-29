package com.example.exp22;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    CheckBox checkBox;
    RadioButton radioButtonMale, radioButtonFemale, radioButtonhi, radioButtonhello;
    RadioGroup radioGroup;
    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        checkBox = findViewById(R.id.checkBox);
        radioButtonMale = findViewById(R.id.radioButtonMale);
        radioButtonFemale = findViewById(R.id.radioButtonFemale);
        radioGroup = findViewById(R.id.radioGroup);
        buttonSubmit = findViewById(R.id.buttonSubmit);


        buttonSubmit.setOnClickListener(v -> {
            String name = editText.getText().toString();
            boolean agreed = checkBox.isChecked();
            String gender = radioButtonMale.isChecked() ? "Male" : "Female";

            if (name.isEmpty()) {
                Toast.makeText(MainActivity.this, "Please enter your name", Toast.LENGTH_SHORT).show();
            } else if (!agreed) {
                Toast.makeText(MainActivity.this, "Please agree to terms and conditions", Toast.LENGTH_SHORT).show();
            } else {
                String message = "Name: " + name + "\nGender: " + gender;
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
