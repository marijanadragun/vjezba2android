package com.example.vjezba6;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myAdapter.adapterViewHolder> {

    private ArrayList<String> textName;
    private ArrayList<String> textStar;
    private ArrayList<String> textImageUrl;
    private Context mContext;

    public myAdapter(Context context, ArrayList<String> textName, ArrayList<String> textStar,ArrayList<String> textImageUrl) {
        this.textName = textName;
        this.textStar = textStar;
        mContext=context;
        this.textImageUrl=textImageUrl;
    }

    @NonNull
    @Override
    public adapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list, parent, false);
        return new adapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterViewHolder holder, int position) {
        Glide.with(mContext)
                .asBitmap()
                .load(textImageUrl.get(position)).error(R.drawable.ic_launcher_foreground)
                .into(holder.imAvatar);

        holder.tOwner.setText(textName.get(position));

        holder.tStar.setText(textStar.get(position));
    }


    @Override
    public int getItemCount() {
        return textName.size();
    }

    public static class adapterViewHolder extends RecyclerView.ViewHolder {
        TextView tOwner;
        TextView tStar;
        ImageView imAvatar;

        public adapterViewHolder(@NonNull View itemView) {
            super(itemView);
            tOwner = itemView.findViewById(R.id.textCollab);
            tStar = itemView.findViewById(R.id.textStar);
            imAvatar = itemView.findViewById(R.id.imageAvatar);

        }


    }

}

