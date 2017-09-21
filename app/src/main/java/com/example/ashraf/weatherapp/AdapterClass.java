package com.example.ashraf.weatherapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by ASHRAF on 9/6/2017.
 */

public class AdapterClass extends ArrayAdapter<ViewClass> {

    private Context context;
    private ArrayList<ViewClass>viewClasses;

    public AdapterClass(@NonNull Context context, ArrayList<ViewClass>viewClasses) {
        super(context, R.layout.list_row,viewClasses);
        this.context=context;
        this.viewClasses=viewClasses;
    }



    private class ViewHolder{
        TextView dayText;
        TextView farenhiteText,celciusText;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            Toast.makeText(context, ""+position, Toast.LENGTH_LONG).show();
            LayoutInflater layoutInflater=LayoutInflater.from(context);
            convertView=layoutInflater.inflate(R.layout.list_row,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.dayText = (TextView) convertView.findViewById(R.id.day);
            viewHolder.farenhiteText = (TextView) convertView.findViewById(R.id.farenhite);
            viewHolder.celciusText = (TextView) convertView.findViewById(R.id.celsius);
            convertView.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) convertView.getTag();
        }
        viewHolder.dayText.setText(viewClasses.get(position).getDay_name());
        viewHolder.farenhiteText.setText(viewClasses.get(position).getFarenhide());
        viewHolder.celciusText.setText(viewClasses.get(position).getCelsius());
        return convertView;
    }

}
