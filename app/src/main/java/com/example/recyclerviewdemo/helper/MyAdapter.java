package com.example.recyclerviewdemo.helper;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemo.R;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Myholder> {

    private String[] data;
    private int[] img_icon;

    //Creating constructor
    public MyAdapter(String[] data, int[] img_icon){

        this.data=data;
        this.img_icon=img_icon;
    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_car,parent,false);
        return new Myholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, final int position) {

        holder.description.setText(data[position]);
        holder.logo.setImageResource(img_icon[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "You clicked: " + data[position] , Toast.LENGTH_SHORT).show();
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setTitle("Info")
                        .setMessage("This is :" +data[position]).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.create().show();
            }
        });


    }

    @Override

    //Return length of data
    public int getItemCount() {
        return data.length;
    }

    public class Myholder extends RecyclerView.ViewHolder{
        ImageView logo;
        TextView description;

        public Myholder(@NonNull View itemView) {

            super(itemView);
            logo = itemView.findViewById(R.id.imgV_logo);
            description = itemView.findViewById(R.id.txtV_description);


        }
    }
}

