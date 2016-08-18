package nayax.com.parx;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kobishasha on 8/3/16.
 */
public class InfoAdapter extends ArrayAdapter<Info> {
    public InfoAdapter(Context context, ArrayList<Info> items){
        super(context, 0, items);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        //Book Object
       final Info currentInfo = getItem(position);

        //Info driver name
        TextView textViewDriverName = (TextView) listItemView.findViewById(R.id.driver_name_text_view);
        textViewDriverName.setText(currentInfo.getmName());

        //Info car number
        TextView textViewCarNumber = (TextView) listItemView.findViewById(R.id.car_number_text_view);
        textViewCarNumber.setText(currentInfo.getmCarNumber());

        ImageView emailImageView = (ImageView)listItemView.findViewById(R.id.email_image_view);
        emailImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");

                intent.putExtra(Intent.EXTRA_EMAIL, new String[] { currentInfo.getmEmail()});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Nayax PARX app - I'm blocking you!");
                intent.putExtra(Intent.EXTRA_TEXT, "Hey, I'm blocking your car, keep in touch!");
                v.getContext().startActivity(Intent.createChooser(intent, "Tell your mate you're blocking him!"));
            }
        });

        // Return the whole list item layout (containing 4 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
