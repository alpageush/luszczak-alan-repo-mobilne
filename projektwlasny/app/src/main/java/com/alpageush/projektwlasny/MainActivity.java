package com.alpageush.projektwlasny;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView label;
    AppViewModel avm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        label = findViewById(R.id.label);
        avm = new ViewModelProvider(this).get(AppViewModel.class);

        if(avm.textShown) showText();
    }

    public void onClick(View view) {
        if(!avm.textShown) showText();
    }

    private void showText() {
        label.setText(getString(R.string.information));
        avm.textShown = true;
    }
}