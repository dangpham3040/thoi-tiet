package com.example.thoitiet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvDanhSach;
    ArrayList<thoitiet> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    private void setEvent() {
        khoiTao();
        CustomAdapterThoiTiet adapterThoiTiet = new CustomAdapterThoiTiet(this, R.layout.listviiew, data);
        lvDanhSach.setAdapter(adapterThoiTiet);
    }

    private void khoiTao() {
        thoitiet tt1 = new thoitiet("Max: 23 Now: 23 Min: 22", "3.24 Km/h", "1000 m", "7/10/2021", R.drawable.matroi);
        thoitiet tt2 = new thoitiet("Max: 23 Now: 23 Min: 22", "3.24 Km/h", "1000 m", "7/10/2021", R.drawable.matroi);
        thoitiet tt3 = new thoitiet("Max: 23 Now: 23 Min: 22", "3.24 Km/h", "1000 m", "7/10/2021", R.drawable.mua);
        thoitiet tt4 = new thoitiet("Max: 23 Now: 23 Min: 22", "3.24 Km/h", "1000 m", "7/10/2021", R.drawable.matroi);
        thoitiet tt5 = new thoitiet("Max: 23 Now: 23 Min: 22", "3.24 Km/h", "1000 m", "7/10/2021", R.drawable.matroi);
        thoitiet tt6 = new thoitiet("Max: 23 Now: 23 Min: 22", "3.24 Km/h", "1000 m", "7/10/2021", R.drawable.mua);
        data.add(tt1);
        data.add(tt2);
        data.add(tt3);
        data.add(tt4);
        data.add(tt5);
        data.add(tt6);

    }

    private void setControl() {
        lvDanhSach = findViewById(R.id.lvDanhSach);
    }
}
