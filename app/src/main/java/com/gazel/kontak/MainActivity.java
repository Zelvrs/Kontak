package com.gazel.kontak;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Contact[] contacts;

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        contacts =  new Contact[]{
                new Contact("Gazel Averrous","Desa Konoha","7241725476458",R.drawable.avatar1),
                new Contact("Gazel Averrous","Desa Konoha","7241725476458",R.drawable.avatar2),
                new Contact("Gazel Averrous","Desa Konoha","7241725476458",R.drawable.avatar3),
                new Contact("Gazel Averrous","Desa Konoha","7241725476458",R.drawable.avatar4),
                new Contact("Gazel Averrous","Desa Konoha","7241725476458",R.drawable.avatar5),
                new Contact("Gazel Averrous","Desa Konoha","7241725476458",R.drawable.avatar6),
                new Contact("Gazel Averrous","Desa Konoha","7241725476458",R.drawable.avatar7),
                new Contact("Gazel Averrous","Desa Konoha","7241725476458",R.drawable.avatar8),
                new Contact("Gazel Averrous","Desa Konoha","7241725476458",R.drawable.avatar9),
                new Contact("Gazel Averrous","Desa Konoha","7241725476458",R.drawable.avatar10),




        };

        custom_adapter custom_adapter = new custom_adapter(this, R.layout.item_contact, contacts);

        listView.setAdapter(custom_adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Contact contact = contacts[position];
                showDialog(contact);
            }
        });
    }

    private  void  showDialog(Contact contact) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("No Telp: " + contact.getPhone())
                .setTitle(contact.getName())
                .setCancelable(false)
                .setPositiveButton("ok", null);

        AlertDialog dialog = builder.create();

        dialog.show();
    }

}
