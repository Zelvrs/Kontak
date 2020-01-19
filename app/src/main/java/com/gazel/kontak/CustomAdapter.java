package com.gazel.kontak;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter {
    private Context mContext;
    private int mResource;
    private Contact[] mContacts;

    private  static  class  ViewHolder {
        ImageView ivAvatar;
        TextView tvName;
        TextView tvAddress;
    }


    public CustomAdapter(@NonNull Context context, int resource, @NonNull Contact[] contacts) {
        super(context, resource, contacts);

        mContext = context;
        mResource = resource;
        mContacts = contacts;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        ViewHolder viewHolder = new ViewHolder();

        if (convertView == null) {
            convertView = layoutInflater.inflate(mResource, parent, false);


            viewHolder.ivAvatar = convertView.findViewById(R.id.ivAvatar);
            viewHolder.tvName = convertView.findViewById(R.id.tvName);
            viewHolder.tvAddress = convertView.findViewById(R.id.tvAddress);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Contact contact = mContacts[position];


        viewHolder.ivAvatar.setImageResource(contact.getAvatar());
        viewHolder.tvName.setText(contact.getName());
        viewHolder.tvAddress.setText(contact.getAddress());

        return convertView;
    }
}
