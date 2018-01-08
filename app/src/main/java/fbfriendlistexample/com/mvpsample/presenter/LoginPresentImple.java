package fbfriendlistexample.com.mvpsample.presenter;

import android.text.TextUtils;

import fbfriendlistexample.com.mvpsample.view.LoginView;

/**
 * Created by Lenovo on 01/08/2018.
 */

public class LoginPresentImple implements LoginPresenter {

    LoginView loginView;


    public LoginPresentImple(LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void validateCredentials(String username, String password) {
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
            loginView.validateinformation();
        } else {
            if (username.equals("admin") && password.equals("pass")) {
                loginView.onSuccess();
            } else {
                loginView.onFailure();
            }
        }
    }

    @Override
    public void onDestroy() {

    }
}
