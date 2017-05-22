package com.example.umair.application;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void process(View view) {
        Intent intent = null, Chooser = null;
        if (view.getId() == R.id.LunchMapp) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:33.738045,73.084488"));
            Chooser = Intent.createChooser(intent, "lunch Mapp");
            startActivity(Chooser);


        }
        if (view.getId() == R.id.lunchMarket) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("market://details?id=com.xs.pooltd&hl=en"));
            Chooser = Intent.createChooser(intent, "lunch market");
            startActivity(Chooser);

        }
        if (view.getId() == R.id.SendEmail) {
            intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to = {"yaribilal69@gmail.com", "cooltalha95@gmail.com"};
            intent.putExtra(Intent.EXTRA_EMAIL, to);
            intent.putExtra(Intent.EXTRA_SUBJECT, "sent from my app");
            intent.putExtra(Intent.EXTRA_TEXT, "how are you");
            intent.setType("message/rfc822");
            Chooser = Intent.createChooser(intent, "Send Email");
            startActivity(Chooser);

        }
    }
}