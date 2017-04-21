package com.estudos.brunobarreto.aula02;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        txtView = (TextView) findViewById(R.id.txtView);

        Intent intent = getIntent();
        if(intent != null) {
            String tmp = intent.getStringExtra("Texto");
            txtView.setText(tmp);
        }

        // String texto = getIntent().getStringExtra("Texto");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Exibindo conteúdo recebido da Acitivity anterior.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
