package com.example.muhammadjohn.assn2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by Muhammad John on 17-Oct-17.
 */

public class PersonAdapter extends ArrayAdapter<Person> {

        Context c;

class ViewHolder {
    TextView tvName;
    Button btn1;
    ImageView image;


}
    public PersonAdapter(@NonNull Context context, @NonNull List<Person> objects) {
        super(context, 0, objects);
        c=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        Log.d(TAG, "convertview : " + convertView);
        View view = convertView;
        ViewHolder vh;



        final Person p = getItem(position);
        view = LayoutInflater.from(getContext()).inflate(R.layout.person_list, parent, false);


        TextView tvName = (TextView) view.findViewById(R.id.tvName);

        Button btn1 = (Button) view.findViewById(R.id.call);
        ImageView image= (ImageView) view.findViewById(R.id.imageView);


        vh = new ViewHolder();
        vh.tvName = tvName;

        vh.btn1=btn1;
        vh.image=image;

        Log.d("PTAG", "third");
        view.setTag(vh);

        vh = (ViewHolder) view.getTag();

        vh.tvName.setText(p.getName());


        Picasso.with(getContext())
                .load("https://scontent.ffjr1-2.fna.fbcdn.net/v/t1.0-1/p160x160/15327254_1814977365452423_4621107666457290150_n.jpg?oh=7c8c54ffbe5def822e3cee680bdabad1&oe=5A6F0B1B")
                .into(vh.image);

        final View finalView = view;
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(),ContactActivity.class);
                i.putExtra("Name", p.getName());
                i.putExtra("Contact", p.getContact());
                i.putExtra("Email",p.getEmail());
                c.startActivity(i);


            }
        });

        final String s =(String) p.getContact();
        vh.btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
               p.setContact("");
                p.setEmail("");
                p.setId("");
                p.setName("");
                Toast.makeText(getContext(),"Deleted",Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
