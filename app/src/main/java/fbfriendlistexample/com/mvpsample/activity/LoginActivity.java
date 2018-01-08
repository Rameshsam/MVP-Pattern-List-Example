package fbfriendlistexample.com.mvpsample.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import fbfriendlistexample.com.mvpsample.R;
import fbfriendlistexample.com.mvpsample.presenter.LoginPresentImple;
import fbfriendlistexample.com.mvpsample.view.LoginView;

public class LoginActivity extends AppCompatActivity implements LoginView {

    LoginPresentImple loginPresentImple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginPresentImple = new LoginPresentImple(this);
        loginPresentImple.validateCredentials("admin", "pass");
    }

    @Override
    public void onSuccess() {
        Toast.makeText(this, "Success", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void validateinformation() {
        Toast.makeText(this, "invalid email or password", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onFailure() {
        Toast.makeText(this, "Failure", Toast.LENGTH_LONG).show();
    }
}
