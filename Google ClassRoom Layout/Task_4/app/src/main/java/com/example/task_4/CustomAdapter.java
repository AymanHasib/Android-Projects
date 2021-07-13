package com.example.task_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    String[] leaderNames;
    String[] teamNames;
    int[] images;
    Context context;
    private LayoutInflater inflater;


    CustomAdapter(Context context, String[] teamNames, String[] leaderNames, int[] images){
        this.context = context;
        this.teamNames = teamNames;
        this.leaderNames = leaderNames;
        this.images = images;
    }

    @Override
    public int getCount() {
        return teamNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.activity_sample_view, parent,false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageViewId);
        TextView textView1 = convertView.findViewById(R.id.teamNameTextViewId);
        TextView textView2 = convertView.findViewById(R.id.leaderNameTextViewId);

        imageView.setImageResource(images[position]);
        textView1.setText(teamNames[position]);
        textView2.setText(leaderNames[position]);

        return convertView;
    }
}
