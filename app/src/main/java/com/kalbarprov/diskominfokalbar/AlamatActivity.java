package com.kalbarprov.diskominfokalbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AlamatActivity extends AppCompatActivity {

    Uri gmmIntentUri;
    Button buttonMAP;
    TextView tvEmail, tvTelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alamat);
        buttonMAP = findViewById(R.id.buttonMAP);
        tvEmail = findViewById(R.id.emaildis);
        tvTelp = findViewById(R.id.telpDiskominfo);
        gmmIntentUri = Uri.parse("google.navigation:q=Diskominfo+Prov.Kalbar, +Pontianak+West+Kalimantan");
        buttonMAP.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            intent.setPackage("com.google.android.apps.maps");
            if (intent.resolveActivity(getPackageManager()) != null ){
                startActivity(intent);
            }
        });
        tvEmail.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("message/rfc822");
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"diskominfo@kalbarprov.go.id"});
            intent.putExtra(Intent.EXTRA_SUBJECT, "");
            intent.setPackage("com.google.android.gm");
            if (intent.resolveActivity(getPackageManager())!=null)
                startActivity(intent);
            else
                Toast.makeText(this,"Gmail App is not installed", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        });
        tvTelp.setOnClickListener(view -> {
            String telp = "05618173627";
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", telp, null));
            startActivity(intent);
        });


    }
}