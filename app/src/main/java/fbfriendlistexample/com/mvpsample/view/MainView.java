package fbfriendlistexample.com.mvpsample.view;

import java.util.List;

/**
 * Created by Lenovo on 01/08/2018.
 */

public interface MainView {
    void setItems(List<String> items);

    void showMessage(String message);
}
