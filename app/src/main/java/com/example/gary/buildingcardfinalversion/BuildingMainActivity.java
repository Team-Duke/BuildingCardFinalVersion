package com.example.gary.buildingcardfinalversion;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class BuildingMainActivity extends ActionBarActivity {

    CardView abbeyCard, bishopsCard, cathedralCard, deansCard, gibneyCard, knightsCard, monksCard,
            sessionsCard, templeCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building_main);

        abbeyCard = (CardView) findViewById(R.id.abbey_card_view);
        abbeyCard.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();
            }

        });

        bishopsCard = (CardView) findViewById(R.id.bishops_card_view);
        bishopsCard.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();
            }

        });

        cathedralCard = (CardView) findViewById(R.id.cathedral_card_view);
        cathedralCard.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();
            }

        });

        deansCard = (CardView) findViewById(R.id.deans_card_view);
        deansCard.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();
            }

        });

        gibneyCard = (CardView) findViewById(R.id.gibney_card_view);
        gibneyCard.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();
            }

        });

        knightsCard = (CardView) findViewById(R.id.knights_card_view);
        knightsCard.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();
            }

        });

        monksCard = (CardView) findViewById(R.id.monks_card_view);
        monksCard.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();
            }

        });

        sessionsCard = (CardView) findViewById(R.id.sessions_card_view);
        sessionsCard.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();
            }

        });

        templeCard = (CardView) findViewById(R.id.temple_card_view);
        templeCard.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening", Toast.LENGTH_SHORT).show();
            }

        });
    }

    private void abbeyClick() {

        startActivity(new Intent("AbbeyWindow"));

    }

    private void bishopsClick() {

        startActivity(new Intent("BishopsWindow"));

    }

    private void cathedralClick() {

        startActivity(new Intent("CathedralWindow"));

    }

    private void deansClick() {

        startActivity(new Intent("DeansWindow"));

    }

    private void gibneyClick() {

        startActivity(new Intent("GibneyWindow"));

    }

    private void knightsClick() {

        startActivity(new Intent("KnightsWindow"));


    }

    private void monksClick() {

        startActivity(new Intent("MonksWindow"));

    }

    private void sessionsClick() {

        startActivity(new Intent("SessionsWindow"));

    }

    private void templeClick() {

        startActivity(new Intent("TempleWindow"));

    }



    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.abbey_card_view:

                abbeyClick();

                break;
            case R.id.bishops_card_view:

                bishopsClick();

                break;
            case R.id.cathedral_card_view:

                cathedralClick();

                break;
            case R.id.deans_card_view:

                deansClick();

                break;

            case R.id.gibney_card_view:

                gibneyClick();

                break;

            case R.id.knights_card_view:

                knightsClick();

                break;

            case R.id.monks_card_view:

                monksClick();

                break;

            case R.id.sessions_card_view:

                sessionsClick();

                break;

            case R.id.temple_card_view:

                templeClick();

                break;

        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_building_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
