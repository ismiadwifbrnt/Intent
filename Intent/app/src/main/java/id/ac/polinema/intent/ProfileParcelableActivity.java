package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import id.ac.polinema.intent.model.User;

public class ProfileParcelableActivity extends AppCompatActivity {

    TextView usernameTeks;
    TextView nameTeks;
    TextView ageTeks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);
        usernameTeks = findViewById(R.id.text_username);
        nameTeks = findViewById(R.id.text_name);
        ageTeks = findViewById(R.id.text_age);


        // TODO: bind here

        Intent intent = getIntent();
        User user = intent.getParcelableExtra("user");

        usernameTeks.setText(user.getUsername());
        nameTeks.setText(user.getName());
        ageTeks.setText(String.valueOf(user.getAge()));
    }
}