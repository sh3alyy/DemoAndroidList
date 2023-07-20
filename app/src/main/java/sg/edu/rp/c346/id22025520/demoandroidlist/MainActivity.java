package sg.edu.rp.c346.id22025520.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroidVersions;
    ArrayList<AndroidVersion> items = new ArrayList<AndroidVersion>();
    ArrayAdapter<AndroidVersion> aaAndroidVersions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // adapter view
        lvAndroidVersions = findViewById(R.id.listView);
        // data source
        items = new ArrayList<>();

        items.add (new AndroidVersion("Pie", "9.0"));
        items.add(new AndroidVersion("Oreo", "8.0 - 8.1"));
        items.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));

        // adapter connect to data source
        CustomAdapter adapter = new CustomAdapter(this, R.layout.row, items);

        // adapter connect to adapter view
        lvAndroidVersions.setAdapter(adapter);
    }
}
