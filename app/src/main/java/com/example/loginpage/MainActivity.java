package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView,textView2,textView3,textView4,textView5;
    ImageView imageView,imageView1;
    EditText editText,editText2;
    Button button;
    CheckBox ch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);
        imageView=findViewById(R.id.imageview);
        imageView1=findViewById(R.id.imageView1);
        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editTextTextEmailAddress);
        editText2=findViewById(R.id.editTextTextPassword);
        button=findViewById(R.id.button);
        ch=(CheckBox)findViewById(R.id.checkBox);

        button.setOnClickListener(view -> {
            if((editText.getText().toString()).equals("") && ((editText2.getText().toString().equals("")))){
                Toast.makeText(MainActivity.this, "Please Enter the Details", Toast.LENGTH_LONG).show();
            }
            else if(((editText.getText().toString()).equals(""))){
                Toast.makeText(MainActivity.this, "Plese Enter the Login Id", Toast.LENGTH_LONG).show();
            }
            else if(((editText2.getText().toString()).equals(""))) {
                Toast.makeText(MainActivity.this, "Please Enter Password", Toast.LENGTH_LONG).show();
            }
            else if(!Check(ch)){
                Toast.makeText(this, "Don't want to stay logged in", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(MainActivity.this, "Welcome!", Toast.LENGTH_SHORT).show();
            }
        });
        if(Check(ch)){
            Toast.makeText(this, "Always logged in", Toast.LENGTH_SHORT).show();
        }

        textView3.setOnClickListener(view -> Toast.makeText(MainActivity.this, "Password has changed", Toast.LENGTH_SHORT).show());

        textView5.setOnClickListener(view -> Toast.makeText(MainActivity.this, "Register with your details", Toast.LENGTH_SHORT).show());
    }
    public Boolean Check( CheckBox ch) {
        if (ch.isChecked()) {
             return true;
        } else {
             return false;
        }
    }
}