package com.example.masjidku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;


public class Dashboard extends AppCompatActivity implements View.OnClickListener{
    private CardView profileCard, airCard, listrikCard, tagihanCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        profileCard = (CardView) findViewById(R.id.profile_card);
        airCard = (CardView) findViewById(R.id.air_card);
        listrikCard = (CardView) findViewById(R.id.listrik_card);
        tagihanCard = (CardView) findViewById(R.id.tagihan_card);

        profileCard.setOnClickListener(this);
        airCard.setOnClickListener(this);
        listrikCard.setOnClickListener(this);
        tagihanCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()) {
            case R.id.profile_card : i = new Intent(this, Profile.class); startActivity(i); break;
            case R.id.air_card : i = new Intent(this, Air.class); startActivity(i); break;
            case R.id.listrik_card : i = new Intent(this, Listrik.class); startActivity(i); break;
            case R.id.tagihan_card : i = new Intent(this, Lampu.class); startActivity(i); break;
            default:break;
        }
    }

    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();//logout
        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }

    public void dashboard(View view) {

    }
}