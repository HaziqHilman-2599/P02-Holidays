package sg.edu.rp.c347.id19023980.p02_holidays;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SecondPage extends AppCompatActivity {
    ListView lv;
    TextView tvType;
    ArrayList<Holidays> al;
    ArrayAdapter<Holidays> aa;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = this.findViewById(R.id.lvHolidays);
        tvType = findViewById(R.id.tvType);

        Intent intentReceived = getIntent();
        int type = intentReceived.getIntExtra("Type",0);

        al = new ArrayList<Holidays>();

        if(type == 0){
            tvType.setText("Secular");

            al.add(new Holidays("newyear","New Year's Day","1 January 2021","An event to celebrate a new year"));
            al.add(new Holidays("labour","Labour Day","1 May 2021", "A public Holiday in honour of working people"));
            al.add(new Holidays("national","National Day","9 August 2021","The day of independence in Singapore"));
        }else if (type == 1){
            tvType.setText("Ethnic & Religion");
            al.add(new Holidays("cny","Chinese New Year","12 February 2021","The start of a new year in Chinese Calendar"));
            al.add(new Holidays("puasa","Hari Raya Puasa","13 May 2021","A day to celebrate the end of the fasting month"));
            al.add(new Holidays("vesak","Vesak Day","26 May 2021","A day to commemorate the birth, enlightenment, and death of Gautama Buddha"));
            al.add(new Holidays("haji","Hari Raya Haji","20 July 2021","A day to honour the willingness of Ibrahim to sacrifice his son Ismael as an act of obedience to God's command"));
            al.add(new Holidays("deepavali","Deepavali","4 November 2021","The festival of light"));
            al.add(new Holidays("christmas","Christmas","25 December 2021","The birth of Christ"));
            al.add(new Holidays("goodfriday","Good Friday","2 April 2021","The Crucifixion of Christ happens on this day"));
        }

        aa = new HolidayAdapter(this,R.layout.secondrow,al);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holidays selectedDay = al.get(position);

                Toast.makeText(SecondPage.this, selectedDay.getName() + " Date: " + selectedDay.getDate() + " Description: " + selectedDay.getDescription() , Toast.LENGTH_SHORT).show();
            }
        });
    }
}
