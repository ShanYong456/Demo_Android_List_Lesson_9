package sg.edu.rp.c346.id18015938.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvVersion;
    ArrayList<AndroidVersion> versionList;
    //ArrayAdapter<AndroidVersion> aaVersion;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvVersion = findViewById(R.id.listViewVersion);
        versionList = new ArrayList<>();

        AndroidVersion item1 = new AndroidVersion("Pie","9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo","8.0 - 8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat","7.0 - 7.1.2");
        AndroidVersion item4 = new AndroidVersion("Marshmallow","6.0 - 6.0.1");
        AndroidVersion item5 = new AndroidVersion("Lollipop","5.0 - 5.1.1");
        AndroidVersion item6 = new AndroidVersion("KitKat", "4.4 - 4.4.4");
        AndroidVersion item7 = new AndroidVersion("Jelly Bean","4.1 - 4.3.1");
        versionList.add(item1);
        versionList.add(item2);
        versionList.add(item3);
        versionList.add(item4);
        versionList.add(item5);
        versionList.add(item6);
        versionList.add(item7);

        //aaVersion = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, versionList);
        adapter = new CustomAdapter(this, R.layout.row, versionList);
        //lvVersion.setAdapter(aaVersion);
        lvVersion.setAdapter(adapter);
    }
}
