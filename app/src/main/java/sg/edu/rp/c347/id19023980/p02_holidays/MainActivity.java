package sg.edu.rp.c347.id19023980.p02_holidays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Type> al;
    ArrayAdapter<Type> aa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = this.findViewById(R.id.LvType);

        al = new ArrayList<Type>();
        al.add(new Type("Secular"));
        al.add(new Type("Ethnic"));

        aa = new TypeAdapter(this,R.layout.firstrow,al);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intent = new Intent(MainActivity.this, SecondPage.class);
                intent.putExtra("Type", position);
                startActivity(intent);
            }
        });
    }
}
