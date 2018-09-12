package com.example.uuzaz.teamcook04_1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ContestInfoAdapter extends ArrayAdapter<String> {

    String[] names;
    int[] flags;
    String [] date;
    String [] dday;
    Context mContext;


    public ContestInfoAdapter(@NonNull Context context, String[] countryNames, int[] countryFlags,String[] contestdate,String[] contestdday) {
        super(context, R.layout.listitem_info);

        this.names = countryNames;
        this.flags = countryFlags;
        this.date = contestdate;
        this.dday = contestdday;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder mViewHolder = new ViewHolder();

        if (convertView == null) { //

            LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.listitem_info, parent, false);
            mViewHolder.mFlag = (ImageView) convertView.findViewById(R.id.listitem_imageview);
            mViewHolder.mName = (TextView) convertView.findViewById(R.id.listitem_textview);
            mViewHolder.mdate = (TextView) convertView.findViewById(R.id.listitem_date);
            mViewHolder.mdday = (TextView) convertView.findViewById(R.id.list_item_dday);
            convertView.setTag(mViewHolder);

        }else{
            mViewHolder = (ViewHolder) convertView.getTag();
        }

        mViewHolder.mFlag.setImageResource(flags[position]);
        mViewHolder.mName.setText(names[position]);
        mViewHolder.mdate.setText(date[position]);
        mViewHolder.mdday.setText(dday[position]);
        return convertView;
    }

    static class ViewHolder {
        ImageView mFlag;
        TextView mName,mdate,mdday;
    }
}
