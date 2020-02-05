package id.ac.poliban.mi.maya.customlistview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Country> data = new ArrayList<>();
    private BaseAdapter adapter;
    private ListView listView;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mi_list_country :
                adapter = new CountryListAdapter(data);
                listView.setAdapter(adapter);
                break;
            case R.id.mi_card_country :
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Maya Studio");
        toolbar.setSubtitle("https://github.com/mayadiahatikasari");
        toolbar.setLogo(android.R.drawable.ic_menu_mylocation);


        listView = findViewById(R.id.listview);
        data.addAll(CountryData.getAllCountries());

    }
}
