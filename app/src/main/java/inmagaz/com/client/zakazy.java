package inmagaz.com.client;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class zakazy extends AppCompatActivity {
    ListView listView = null;
    ArrayList arrayList1 = new ArrayList();
    ArrayList arrayList2 = new ArrayList();
    ArrayList arrayList3 = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakazy);
        arrayList1.add("500 сом");
        arrayList1.add("500 сом");
        arrayList1.add("500 сом");
        arrayList1.add("500 сом");
        arrayList1.add("500 сом");
        arrayList1.add("500 сом");
        arrayList1.add("500 сом");
        arrayList1.add("500 сом");
        arrayList1.add("500 сом");
        arrayList1.add("500 сом");

        arrayList2.add("42-48");
        arrayList2.add("42-48");
        arrayList2.add("42-48");
        arrayList2.add("42-48");
        arrayList2.add("42-48");
        arrayList2.add("42-48");
        arrayList2.add("42-48");
        arrayList2.add("42-48");
        arrayList2.add("42-48");
        arrayList2.add("42-48");

        arrayList3.add("Тоголок молдо 34");
        arrayList3.add("Тоголок молдо 34");
        arrayList3.add("Тоголок молдо 34");
        arrayList3.add("Тоголок молдо 34");
        arrayList3.add("Тоголок молдо 34");
        arrayList3.add("Тоголок молдо 34");
        arrayList3.add("Тоголок молдо 34");
        arrayList3.add("Тоголок молдо 34");
        arrayList3.add("Тоголок молдо 34");
        arrayList3.add("Тоголок молдо 34");


        listView = (ListView) findViewById(R.id.listView);
        CustomArrayAdapter customArrayAdapter = new CustomArrayAdapter(zakazy.this,arrayList1,arrayList2,arrayList3);

        listView.setAdapter(customArrayAdapter);
    }
}
