package com.example.thoitiet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapterThoiTiet extends ArrayAdapter {
    Context context;
    int resource;
    ArrayList<thoitiet>data;
    public CustomAdapterThoiTiet(@NonNull Context context, int resource, @NonNull ArrayList<thoitiet>data) {
        super(context, resource, data);
        this.context = context;
        this.resource = resource;
        this.data = data;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(resource,null);

        ImageView ivThoiTiet = convertView.findViewById(R.id.ivThoiTiet);
        TextView tvNhietDo = convertView.findViewById(R.id.tvNhietDo);
        TextView tvTocDo = convertView.findViewById(R.id.tvTocDo);
        TextView tvTamNhin = convertView.findViewById(R.id.tvTamNhin);
        TextView tvThoiGian = convertView.findViewById(R.id.tvThoiGian);

        thoitiet thoiTiet = data.get(position);
        tvNhietDo.setText(thoiTiet.getNhietDo());
        tvTocDo.setText(thoiTiet.getTocDo());
        tvTamNhin.setText(thoiTiet.getTamNhin());
        tvThoiGian.setText(thoiTiet.getThoiGian());
        ivThoiTiet.setImageResource(thoiTiet.thoiTiet);

        return  convertView;
    }
}
