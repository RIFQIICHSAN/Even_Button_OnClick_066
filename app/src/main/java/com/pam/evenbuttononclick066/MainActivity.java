package com.pam.evenbuttononclick066;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variable untuk button
    Button btnLogin;

    //Deklarasi variable untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variable untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variable btnLogin dengan componen button pada layout
        btnLogin=findViewById(R.id.btSignIn);

        //Menghubungkan variable edemail dengan componen button pada layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variable edpassword dengan componen button pada layout
        edpassword=findViewById(R.id.edPassword);

        //membuat fungsi onclik pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menyimpan input user di edittext email kedalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                //membuat variabel toast dan membuat toast dengan menambahkan variabel nama dan password
                Toast a = Toast.makeText(getApplicationContext(),
                        "Login Sukses",Toast.LENGTH_LONG);
                Toast b = Toast.makeText(getApplicationContext(),
                        "Password Salah",Toast.LENGTH_LONG);
                Toast c = Toast.makeText(getApplicationContext(),
                        "Email Salah",Toast.LENGTH_LONG);
                Toast d = Toast.makeText(getApplicationContext(),
                        "Email dan Password salah",Toast.LENGTH_LONG);

                a.show();
                b.show();
                c.show();
                d.show();
            }
        });
    }

}