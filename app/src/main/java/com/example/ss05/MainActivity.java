package com.example.ss05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Contact> listContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //b1 : data source
        initData();
        //b2 : Adapter
        ContactAdapter adapter = new ContactAdapter(listContacts, this);
        //b3 : Layout Manager
         //RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        //b4 ; Recycler View
        RecyclerView recyclerView = findViewById(R.id.rvContact);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    private void initData() {
        listContacts.add(new Contact("Nguyễn Tiến Đạt", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Nguyễn Xuân Tùng", "012412112", R.drawable.user2));
        listContacts.add(new Contact("Lưu Quỳnh Anh", "012412112", R.drawable.user3));
        listContacts.add(new Contact("Trình Mạnh CƯờng", "012412112", R.drawable.user4));
        listContacts.add(new Contact("Phạm Thị Điểm", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Nguyễn Văn Phúc", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Phạm Thị Giảng", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Vũ Khắc Tiệp", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Nguyễn Đình ĐỘ", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Phạn Thu Hà", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Nguyễn Chí Thắng", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Nguyễn Tiến Đạt", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Nguyễn Xuân Tùng", "012412112", R.drawable.user2));
        listContacts.add(new Contact("Lưu Quỳnh Anh", "012412112", R.drawable.user3));
        listContacts.add(new Contact("Trình Mạnh CƯờng", "012412112", R.drawable.user4));
        listContacts.add(new Contact("Phạm Thị Điểm", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Nguyễn Văn Phúc", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Phạm Thị Giảng", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Vũ Khắc Tiệp", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Nguyễn Đình ĐỘ", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Phạn Thu Hà", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Nguyễn Chí Thắng", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Nguyễn Tiến Đạt", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Nguyễn Xuân Tùng", "012412112", R.drawable.user2));
        listContacts.add(new Contact("Lưu Quỳnh Anh", "012412112", R.drawable.user3));
        listContacts.add(new Contact("Trình Mạnh CƯờng", "012412112", R.drawable.user4));
        listContacts.add(new Contact("Phạm Thị Điểm", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Nguyễn Văn Phúc", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Phạm Thị Giảng", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Vũ Khắc Tiệp", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Nguyễn Đình ĐỘ", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Phạn Thu Hà", "012412112", R.drawable.user1));
        listContacts.add(new Contact("Nguyễn Chí Thắng", "012412112", R.drawable.user1));
    }
}