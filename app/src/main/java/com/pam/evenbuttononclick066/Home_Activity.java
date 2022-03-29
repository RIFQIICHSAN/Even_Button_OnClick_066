package com.pam.evenbuttononclick066;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import java.util.ArrayList;

public class Home_Activity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    //Deklarasi variabel dengan jenis data ListView
    private ListView list;

    //Memanggil class ListViewAdapter dan diinisiasi menjadi variabel adapter
    private  ListViewAdapter adapter;

    //Deklarasi array untuk menyimpan nama
    String[] listNama;

    //Memanggil class ClassNama
    public static ArrayList<ClassNama> classNamaArrayList = new ArrayList<ClassNama>();

    //Membuat objek bundle
    Bundle bundle = new Bundle();

    //Membuat objek intent
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //menyimpan objek dari class ClassNama menjadi arrayList
        listNama = new String[]{"Inayah", "Ilham", "Eris",
                "Fikri", "Maul", "Intan", "Vina", "Gita",
                "Vian", "Lutfi"};

        list = findViewById(R.id.listKontak);

        //membuat objek dari class ClassNama menjadi arraylist
        classNamaArrayList = new ArrayList<>();

        //membaca seluruh data pada array listNama
        for (int i = 0; i < listNama.length; i++)
        {
            //membuat objek class nama do
            ClassNama classNama = new ClassNama(listNama[i]);
            //Binds string le array
            classNamaArrayList.add(classNama);
        }

        //membuat objek dari ListViewAdapter
        adapter = new ListViewAdapter(this);

        //Binds Adapter ke ListView
        list.setAdapter(adapter);

        //membuat event dari list onclick
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Deklarasi variabel nama yang berisi item yang diklik
                String nama = classNamaArrayList.get(position).getNama();

                //memasukkan value dari variabel nama dengan kunci "a"
                // dan dimasukkan kedalam bundle
                bundle.putString("a",nama.trim());

                //membuat objek popup menu
                PopupMenu pm = new PopupMenu(getApplicationContext(),view);

                //membuat event untuk popup menu ketika dipilih
                pm.setOnMenuItemClickListener(Home_Activity.this);

                //menampilkan popup menu dari layout menu
                pm.inflate(R.menu.popup_menu);

                //menampilkan popup menu
                pm.show();
            }
        });
    }

    //event yang terjadi ketika menu dipilih

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId())
        {
            case R.id.mnview:
                intent = new Intent(getApplicationContext(),ActivityLihatData.class);
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.mnedit:
                Toast.makeText(getApplicationContext(), "Ini untuk edit kontak",
                        Toast.LENGTH_LONG).show();
                break;
        }
        return false;
    }
}