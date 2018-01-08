package fbfriendlistexample.com.mvpsample.presenter;

/**
 * Created by Lenovo on 01/08/2018.
 */

public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}
