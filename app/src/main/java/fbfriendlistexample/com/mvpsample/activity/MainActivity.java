package fbfriendlistexample.com.mvpsample.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import fbfriendlistexample.com.mvpsample.R;
import fbfriendlistexample.com.mvpsample.presenter.MainPresentImple;
import fbfriendlistexample.com.mvpsample.view.MainView;

public class MainActivity extends AppCompatActivity implements MainView ,AdapterView.OnItemClickListener{

    ListView listView;
    MainPresentImple mainPresentImple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_item);
        listView.setOnItemClickListener(this);
        mainPresentImple = new MainPresentImple(this);
        ArrayList<String> stringArrayList=new ArrayList<>();
        stringArrayList.add("XYZ");
        stringArrayList.add("YAX");
        stringArrayList.add("POL");
        stringArrayList.add("ADB");
        stringArrayList.add("BDK");
        stringArrayList.add("EDO");
        stringArrayList.add("API");
        stringArrayList.add("APC");
        mainPresentImple.itemsSort(stringArrayList);

    }

    @Override
    public void setItems(List<String> items) {
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items));
    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        mainPresentImple.onItemClicked(position);
    }
}
