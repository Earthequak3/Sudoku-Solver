package com.example.sudokuappsolver;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView nameView, tagView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview_library);
        nameView = itemView.findViewById(R.id.name_library);
        tagView = itemView.findViewById(R.id.tag_library);
    }
}
