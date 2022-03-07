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
            public void onClick(View v) {

                //menyimpan input user di edittext email kedalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                String email = "Ican@gmail.com";
                String pwd = "Ican123";

                if (nama.isEmpty() || password.isEmpty()){
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan Password wajib diisi", Toast.LENGTH_LONG);
                    t.show();
                }
                else {

                    if (nama.equals(email) && password.equals(pwd)) {
                        Toast t = Toast.makeText(getApplicationContext(), "Login Sukses",
                                Toast.LENGTH_LONG);
                        t.show();

                        Bundle b = new Bundle();

                        b.putString("a", nama.trim());

                        b.putString("b", password.trim());

                        Intent intent = new Intent(getApplicationContext(), ActivityKedua.class);

                        intent.putExtras(b);
                        startActivity(intent);

                } else {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login Gagal", Toast.LENGTH_LONG);
                    t.show();
                }
            }
        }
    });}}