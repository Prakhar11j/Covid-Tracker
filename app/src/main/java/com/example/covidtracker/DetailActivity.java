package com.example.covidtracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import com.leo.simplearcloader.SimpleArcLoader;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

public class DetailActivity extends AppCompatActivity {

    private int positionC;
    TextView countryName, cases, recovered, critical, active, today, totalDeaths, todayDeaths;
    SimpleArcLoader simpleArcLoader;
    ScrollView scrollView;
    PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        countryName       =  findViewById(R.id.cName);
        cases             =  findViewById(R.id.tvCases2);
        recovered         =  findViewById(R.id.tvRecovered2);
        critical          =  findViewById(R.id.tvCritical2);
        active            =  findViewById(R.id.tvActive2);
        today             =  findViewById(R.id.tvToday2);
        totalDeaths       =  findViewById(R.id.tvTotalDeaths2);
        todayDeaths       =  findViewById(R.id.tvTodayDeaths2);

        simpleArcLoader   =  findViewById(R.id.loader3);
        scrollView        =  findViewById(R.id.scrollStats2);
        pieChart          =  findViewById(R.id.pieChart2);

        getSupportActionBar().setTitle("DetailActivity");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Intent intent = getIntent();
        positionC = intent.getIntExtra("Pos",0);
        simpleArcLoader.start();

        countryName.setText("Stats of " + AffectedCountries.countryModelList.get(positionC).getCountry());
        cases.setText(AffectedCountries.countryModelList.get(positionC).getCases());
        recovered.setText(AffectedCountries.countryModelList.get(positionC).getRecovered());
        critical.setText(AffectedCountries.countryModelList.get(positionC).getCritical());
        active.setText(AffectedCountries.countryModelList.get(positionC).getActive());
        today.setText(AffectedCountries.countryModelList.get(positionC).getToday());
        totalDeaths.setText(AffectedCountries.countryModelList.get(positionC).getTotalDeaths());
        todayDeaths.setText(AffectedCountries.countryModelList.get(positionC).getTodayDeaths());

        pieChart.addPieSlice(new PieModel("Cases",    Integer.parseInt(cases.getText().toString()), Color.parseColor("#FFA726")));
        pieChart.addPieSlice(new PieModel("Recovered",Integer.parseInt(recovered.getText().toString()), Color.parseColor("#66BB6A")));
        pieChart.addPieSlice(new PieModel("Deaths",   Integer.parseInt(totalDeaths.getText().toString()), Color.parseColor("#EF5350")));
        pieChart.addPieSlice(new PieModel("Active",   Integer.parseInt(active.getText().toString()), Color.parseColor("#29B6F6")));

        pieChart.startAnimation();

        simpleArcLoader.stop();
        simpleArcLoader.setVisibility(View.GONE);
        scrollView.setVisibility(View.VISIBLE);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}