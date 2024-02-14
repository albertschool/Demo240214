package com.example.demo240214;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {
    private ArrayList<Task> tasks;
    private final OnItemClickListener listener;
    public TaskAdapter(ArrayList<Task> tasks, OnItemClickListener listener) {
        this.tasks = tasks;
        this.listener = listener;
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View taskView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.task_layout, parent, false);
        return new TaskViewHolder(taskView);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        Task currentTask = tasks.get(position);
        holder.tVLayoutDueDate.setText(currentTask.getDueDate());
        holder.tVLayoutGroup.setText(currentTask.getGroupName());
        holder.tVLayoutName.setText(currentTask.getName());
        holder.tBLayoutPart.setChecked(currentTask.isPartClass());
        holder.bind(position, listener);
    }


    @Override
    public int getItemCount() {
        return tasks.size();
    }

    public static class TaskViewHolder extends RecyclerView.ViewHolder {
        public TextView tVLayoutDueDate;
        public TextView tVLayoutGroup;
        public TextView tVLayoutName;
        public ToggleButton tBLayoutPart;

        public TaskViewHolder(@NonNull View itemView) {
            super(itemView);
            tVLayoutDueDate = itemView.findViewById(R.id.tVLayoutDueDate);
            tVLayoutGroup = itemView.findViewById(R.id.tVLayoutGroup);
            tVLayoutName = itemView.findViewById(R.id.tVLayoutName);
            tBLayoutPart = itemView.findViewById(R.id.tBLayoutPart);
        }
        public void bind(final int position, final OnItemClickListener listener) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    listener.onItemClick(position);
                }
            });
        }
    }
}
