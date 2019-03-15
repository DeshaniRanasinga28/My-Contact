package com.contect.mycontect.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.contect.mycontect.R;

public class ContactHolder extends RecyclerView.ViewHolder {

    ImageView contactImageView;
    TextView nameTextView;
    TextView numberTextView;

    private Context context;

    public ContactHolder(@NonNull View itemView) {
        super(itemView);

        contactImageView = (ImageView)itemView.findViewById(R.id.contact_imgVw);
        nameTextView = (TextView)itemView.findViewById(R.id.name_TxtVw);
        numberTextView = (TextView)itemView.findViewById(R.id.number_TxtVw);

    }
}
