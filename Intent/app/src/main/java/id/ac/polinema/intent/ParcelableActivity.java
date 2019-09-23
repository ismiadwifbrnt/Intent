package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import id.ac.polinema.intent.model.User;

public class ParcelableActivity extends AppCompatActivity {

    public static final String USER_KEY = "user";

    private EditText usernameInput;
    private EditText nameInput;
    private EditText ageInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);

        usernameInput = findViewById(R.id.input_username);
        nameInput = findViewById(R.id.input_name);
        ageInput = findViewById(R.id.input_age);
    }

    public void handleSubmit(View view) {

        String username = usernameInput.getText().toString();
        String name = nameInput.getText().toString();
        String age = ageInput.getText().toString();

        Intent intent = new Intent(this,ProfileParcelableActivity.class);
        User user = new User(username,name,age);
        intent.putExtra(USER_KEY , user);

        startActivity(intent);
    }

}
