package sg.edu.rp.c347.id19023980.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TypeAdapter extends ArrayAdapter<Type> {

    private ArrayList<Type> type;
    private Context context;
    private TextView tvType;
    public TypeAdapter(@NonNull Context context, int resource, ArrayList<Type> objects) {
        super(context, resource, objects);

        type = objects;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.firstrow, parent, false);

        tvType = rowView.findViewById(R.id.tvType);

        Type currentType = type.get(position);
        if (currentType.getType().equals("Secular")){
            tvType.setText("Secular");
        }else if (currentType.getType().equals("Ethnic")){
            tvType.setText("Ethnic & Religion");
        }
        return rowView ;
    }
}
