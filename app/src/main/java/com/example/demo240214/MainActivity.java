package com.example.demo240214;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemClickListener{

    RecyclerView rV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rV = findViewById(R.id.rV);

        ArrayList<Task> tasks = new ArrayList<Task>();
        for (int i = 0; i < 10; i++) {
            Task task = new Task(String.valueOf(1+i),
                    String.valueOf(20200201+i),
                    String.valueOf(20240211+i),
                    String.valueOf(10+i),
                    (i>=5));
            tasks.add(task);
        }

        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rV.setLayoutManager(lm);

        TaskAdapter taskAdp = new TaskAdapter(tasks,this);
        rV.setAdapter(taskAdp);
    }


    @Override
    public void onItemClick(int position) {
        Toast.makeText(this, ""+position, Toast.LENGTH_SHORT).show();
    }
}