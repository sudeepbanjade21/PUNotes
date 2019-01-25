package com.example.punotes;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.CustomViewHolder> {
    private Context context;
    private List<Student> students;
    OnRowClickListener onRowClickListener;

    public StudentAdapter(Context context, List<Student> students) {
        this.context = context;
        this.students = students;
    }




    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.student_list, viewGroup, false);
        return new CustomViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, final int position) {
        final Student student = students.get(position);
        customViewHolder.name.setText(student.getName());
        customViewHolder.logoID.setImageResource(student.getLogoID());
        customViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onRowClickListener.onRowClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return students.size();
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder  {
        private TextView name;
        private ImageView logoID;
        private LinearLayout linear;
        CardView cardView;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView=itemView.findViewById(R.id.cardView);
            linear = itemView.findViewById(R.id.linear);
            name = itemView.findViewById(R.id.tvName);
            logoID = itemView.findViewById(R.id.ivLogo);
        }

    }

    public interface OnRowClickListener {
        void onRowClick(int position);
    }
    public void setOnRowClickListener(OnRowClickListener onRowClickListener) {
        this.onRowClickListener = onRowClickListener;
    }
}
