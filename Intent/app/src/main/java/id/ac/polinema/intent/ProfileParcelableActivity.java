package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import id.ac.polinema.intent.model.User;

public class ProfileParcelableActivity extends AppCompatActivity {
        private TextView output_username;
        private TextView output_name;
        private TextView output_age;
        User user = new User();

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        output_username = findViewById(R.id.text_username);
        output_name = findViewById(R.id.text_name);
        output_age = findViewById(R.id.text_age);

        user = getIntent().getParcelableExtra("user");
        if (user!= null) {
            output_username.setText(user.getUsername());
            output_age.setText(user.getAge());
            output_name.setText(user.getName());
        }
    }
}
