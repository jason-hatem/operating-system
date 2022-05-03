package com.example.operatingsystemproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class RegisterActivity extends AppCompatActivity {

    EditText firstName, lastName, email, phoneNumber, address, username, password, confirmPassword;
    Spinner position;
    Button register;

    ArrayList <User> users = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        firstName = findViewById(R.id.etFirstName);
        lastName = findViewById(R.id.etLastName);
        email = findViewById(R.id.etEmail);
        phoneNumber = findViewById(R.id.etPhoneNumber);
        address = findViewById(R.id.etAddress);
        username = findViewById(R.id.etUsername);
        password = findViewById(R.id.etPassword);
        confirmPassword = findViewById(R.id.etConfirmPassword);

        position = findViewById(R.id.spPositions);

        register = findViewById(R.id.btRegister);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int id = 0, priority = 0;

                String positionStr = position.getSelectedItem().toString();

                if (positionStr.equals("Entry-Level")){

                }
                else  if (positionStr.equals("Mid-Level")){

                }
                else  if (positionStr.equals("Senior-Level")){

                }
                User user = new User(firstName.getText().toString(), lastName.getText().toString()
                ,email.getText().toString(), Long.parseLong(phoneNumber.getText().toString()),
                        address.getText().toString(), position.getSelectedItem().toString(),
                        id, priority, username.getText().toString(), password.getText().toString());

                users.add(user);

                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                intent.putExtra("PRIORITY", priority);
                startActivity(intent);
                finish();
            }
        });


    }
}