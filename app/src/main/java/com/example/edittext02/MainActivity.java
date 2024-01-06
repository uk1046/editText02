package com.example.edittext02;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bttn;
    EditText txt1,txt2,txt3,txt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bttn = (Button)findViewById(R.id.btn01);
        txt1 = (EditText)findViewById(R.id.userId);
        txt2 = (EditText) findViewById(R.id.pass);
        txt3 = (EditText)findViewById(R.id.userId01);
        txt4 = (EditText)findViewById(R.id.pass02);
        bttn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(txt1.getText().toString().isEmpty() && txt2.getText().toString().isEmpty() &&
                        txt3.getText().toString().isEmpty() && txt4.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter All The Fields", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Name: "+txt1.getText()+"\nClass: "+txt2.getText()+"Enrollment No: "+txt3.getText()
                            +"Seat No: "+txt4.getText(), Toast.LENGTH_LONG).show();
                }
            }

        });

    }
}