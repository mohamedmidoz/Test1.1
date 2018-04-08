package com.example.mohamed.usingstringfile;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CanExpert expert = new CanExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void onClickFindCan(View view) {

        TextView brands = findViewById(R.id.brands);
        Spinner color = findViewById(R.id.color);
        String SelectedColor = String.valueOf(color.getSelectedItem());
//        brands.setText(SelectedColor);
        List<String> brandsList = expert.getCanType(SelectedColor);
        StringBuilder BrandFormatted = new StringBuilder();
        for (String canBrand : brandsList) {
            BrandFormatted.append(canBrand).append('\n');
        }
        brands.setText(BrandFormatted);
    }
}