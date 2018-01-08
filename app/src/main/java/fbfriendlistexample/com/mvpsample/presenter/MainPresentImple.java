package fbfriendlistexample.com.mvpsample.presenter;

import java.util.ArrayList;
import java.util.Collections;

import fbfriendlistexample.com.mvpsample.view.MainView;

/**
 * Created by Lenovo on 01/08/2018.
 */

public class MainPresentImple implements MainPresenter {


    private MainView mainView;

    public MainPresentImple(MainView mainView) {
        this.mainView = mainView;
    }


    @Override
    public void onResume() {

    }

    @Override
    public void onItemClicked(int position) {
        if (mainView != null) {
            mainView.showMessage(String.format("Position %d clicked", position + 1));
        }
    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void itemsSort(ArrayList<String> strings) {
        if (mainView != null) {
            Collections.sort(strings);
            mainView.setItems(strings);
        }

    }


}
