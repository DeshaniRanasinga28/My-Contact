package com.contect.mycontect.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.contect.mycontect.R;
import com.contect.mycontect.model.Contacts;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactHolder>{

    private ArrayList<Contacts> contactsArrayList = new ArrayList<>();
    ContactHolder contactHolder;
    Context context;

    public ContactAdapter(ArrayList<Contacts> contactsArrayList, Context context) {
        this.contactsArrayList = contactsArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ContactHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.raw_item_list, parent, false);
        contactHolder = new ContactHolder(view);
        return contactHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactHolder holder, int position) {
        final Contacts contacts = contactsArrayList.get(position);

        String url = contacts.getImage_url();
        Picasso.with(context)
                .load(url)
                .resize(250, 250)
                .centerCrop()
                .into(holder.contactImageView);

        holder.nameTextView.setText(contacts.getName());
        holder.numberTextView.setText(contacts.getNumber());
    }

    @Override
    public int getItemCount() {
        return contactsArrayList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
