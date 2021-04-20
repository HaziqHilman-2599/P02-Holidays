package sg.edu.rp.c347.id19023980.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holidays> {

    private Context context;
    private ArrayList<Holidays> holidays;
    private TextView tvName;
    private TextView tvDate;
    private ImageView ivPhoto;
    public HolidayAdapter(@NonNull Context context, int resource,ArrayList<Holidays> objects) {
        super(context, resource,objects);

        holidays = objects;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.secondrow, parent, false);

        tvName = rowView.findViewById(R.id.tvName);
        tvDate = rowView.findViewById(R.id.tvDate);
        ivPhoto = rowView.findViewById(R.id.imageView);

        Holidays currentHoliday = holidays.get(position);

        tvName.setText(currentHoliday.getName());
        tvDate.setText(currentHoliday.getDate());

        if (currentHoliday.getPhoto().equals("labour")){
            ivPhoto.setImageResource(R.drawable.labour_day);
        }else if (currentHoliday.getPhoto().equals("national")){
            ivPhoto.setImageResource(R.drawable.national_day);
        }else if (currentHoliday.getPhoto().equals("newyear")) {
            ivPhoto.setImageResource(R.drawable.new_year);
        } else if (currentHoliday.getPhoto().equals("goodfriday")){
            ivPhoto.setImageResource(R.drawable.good_friday);
        }

       else if (currentHoliday.getPhoto().equals("christmas")){
        ivPhoto.setImageResource(R.drawable.christmas);
    } else if (currentHoliday.getPhoto().equals("cny")){
            ivPhoto.setImageResource(R.drawable.cny);
        }else if (currentHoliday.getPhoto().equals("deepavali")){
            ivPhoto.setImageResource(R.drawable.deepavali);
        }else if (currentHoliday.getPhoto().equals("haji")){
            ivPhoto.setImageResource(R.drawable.hari_raya_haji);
        }else if (currentHoliday.getPhoto().equals("puasa")){
            ivPhoto.setImageResource(R.drawable.hari_raya_puasa);
        }else if (currentHoliday.getPhoto().equals("vesak")){
            ivPhoto.setImageResource(R.drawable.vesak_day);
        }
        return rowView ;
    }
    }

