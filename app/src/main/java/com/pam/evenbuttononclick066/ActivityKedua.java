package com.pam.evenbuttononclick066;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class ActivityKedua extends AppCompatActivity {
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        //Menghubungkan variable txEmail dengan componen TextView pada layout
        txEmail = findViewById(R.id.tvEmail);

        //Menghubungkan variable txPassword dengan componen TextVoew pada layout
        txPassword = findViewById(R.id.tvPassword);

        //Mendeklarasikan variable bundle yang akan digunakan untuk mengambil
        //pesan yang dikirimkan melalui method intent
        Bundle bundle = getIntent().getExtras();

        //Membuat variabel string yang digunakan untuk menyimpan data yang
        // dikirimkan dari activity sebelumnya dengan kunci "a"
        String email = bundle.getString("a");

        //Membuat variabel string yang digunakan untuk menyimpan data yang
        // dikirimkan dari activity sebelumnya dengan kunci "b"
        String pass = bundle.getString("b");

        //menampilkan value dari variabel email kedalam txEmail
        txEmail.setText(email);

        //menampilkan value dari variabel pass kedalam txPassword
        txPassword.setText(pass);


    }
}
