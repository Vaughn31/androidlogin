package com.example.login.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.login.login.R;

public class MainActivity extends AppCompatActivity {

    EditText inputUsername, inputPassword;
    Button buttonLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputUsername = (EditText) findViewById(R.id.inputUsername);
        inputPassword = (EditText) findViewById(R.id.inputPassword);

        buttonLogin = (Button) findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = inputUsername.getText().toString();
                String password = inputPassword.getText().toString();

                if (inputUsername.getText().toString().equals("Vaughn Scott Esteban") && inputPassword.getText().toString().equals("20192027"))
                {

                    Toast.makeText(MainActivity.this, "Welcome to Dashboard", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), esteban.class);
                    startActivity(intent);
                }

                else if (!inputUsername.getText().toString().equals("Vaughn Scott Esteban") && inputPassword.getText().toString().equals("20192027"))
                {
                    Toast.makeText(MainActivity.this, "Invalid Username", Toast.LENGTH_SHORT).show();

                }
                else if (inputUsername.getText().toString().equals("Vaughn Scott Esteban") && !inputPassword.getText().toString().equals("20192027"))
                {
                    Toast.makeText(MainActivity.this, "Invalid Password", Toast.LENGTH_SHORT).show();
                }

                if (inputUsername.getText().toString().equals("Phillip Aleksei Fernandez") && inputPassword.getText().toString().equals("20192375"))
                {

                    Toast.makeText(MainActivity.this, "Welcome to Dashboard", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), fernandez.class);
                    startActivity(intent);
                }

                else if (!inputUsername.getText().toString().equals("Phillip Aleksei Fernandez") && inputPassword.getText().toString().equals("20192375"))
                {
                    Toast.makeText(MainActivity.this, "Invalid Username", Toast.LENGTH_SHORT).show();

                }
                else if (inputUsername.getText().toString().equals("Phillip Aleksei Fernandez") && !inputPassword.getText().toString().equals("20192375"))
                {
                    Toast.makeText(MainActivity.this, "Invalid Password", Toast.LENGTH_SHORT).show();
                }
                if (inputUsername.getText().toString().equals("Jeremy Torne") && inputPassword.getText().toString().equals("20194685"))
                {

                    Toast.makeText(MainActivity.this, "Welcome to Dashboard", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), torne.class);
                    startActivity(intent);
                }

                else if (!inputUsername.getText().toString().equals("Jeremy Torne") && inputPassword.getText().toString().equals("20194685"))
                {
                    Toast.makeText(MainActivity.this, "Invalid Username", Toast.LENGTH_SHORT).show();

                }
                else if (inputUsername.getText().toString().equals("Jeremy Torne") && !inputPassword.getText().toString().equals("20194685"))
                {
                    Toast.makeText(MainActivity.this, "Invalid Password", Toast.LENGTH_SHORT).show();
                }
                if (inputUsername.getText().toString().equals("John Cris Marzo") && inputPassword.getText().toString().equals("20194839"))
                {

                    Toast.makeText(MainActivity.this, "Welcome to Dashboard", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), marzo.class);
                    startActivity(intent);
                }

                else if (!inputUsername.getText().toString().equals("John Cris Marzo") && inputPassword.getText().toString().equals("20194839"))
                {
                    Toast.makeText(MainActivity.this, "Invalid Username", Toast.LENGTH_SHORT).show();

                }
                else if (inputUsername.getText().toString().equals("John Cris Marzo") && !inputPassword.getText().toString().equals("20194839"))
                {
                    Toast.makeText(MainActivity.this, "Invalid Password", Toast.LENGTH_SHORT).show();
                }





                else
                {
                    Toast.makeText(MainActivity.this, " Invalid Credentials", Toast.LENGTH_SHORT).show();
                }




            }
        });

    }
}