package fbfriendlistexample.com.mvpsample.presenter;

import java.util.ArrayList;

/**
 * Created by Lenovo on 01/08/2018.
 */

public interface MainPresenter {
    void onResume();

    void onItemClicked(int position);

    void onDestroy();

    void  itemsSort(ArrayList<String> strings);
}
