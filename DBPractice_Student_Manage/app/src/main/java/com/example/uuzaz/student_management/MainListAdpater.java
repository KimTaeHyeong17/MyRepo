package com.example.uuzaz.student_management;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainListAdpater extends ArrayAdapter<StudentVO> {
    Context context;
    ArrayList<StudentVO> datas;
    int resId;

    public MainListAdpater(Context context, int resId, ArrayList<StudentVO> datas) {
        super(context,resId);
        this.context=context;
        this.datas=datas;
        this.resId=resId;
    }
    @Override
    public int getCount() {
        return datas.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null) {
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(resId,null);

            MainListWrapper wrapper = new MainListWrapper(convertView);
            convertView.setTag(wrapper);
        }
        MainListWrapper wrapper = (MainListWrapper) convertView.getTag();
        ImageView studentImageView = wrapper.studentImageView;
        TextView nameView = wrapper.nameView;
        final ImageView contactView = wrapper.contactView;

        final StudentVO vo = datas.get(position);
        nameView.setText(vo.name);

        return convertView;

    }
}
