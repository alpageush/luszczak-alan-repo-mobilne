package com.alan.luszczak.sprawdzian;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MyViewModel viewModel;
    TextView name, surname, klasa, year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.imieText);
        surname = findViewById(R.id.nazwiskoText);
        klasa = findViewById(R.id.klasaText);
        year = findViewById(R.id.rokText);

        viewModel = new MyViewModel();

        name.setText(viewModel.getName());
        surname.setText(viewModel.getSurname());
        klasa.setText(viewModel.getKlasa());
        year.setText(viewModel.getYear());
    }

    public void onSaveClick(View view) {
        viewModel.setName(name.getText().toString());
        viewModel.setSurname(surname.getText().toString());
        viewModel.setKlasa(klasa.getText().toString());
        viewModel.setYear(year.getText().toString());
    }
}