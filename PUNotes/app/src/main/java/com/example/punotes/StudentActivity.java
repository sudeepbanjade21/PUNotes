package com.example.punotes;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class StudentActivity extends AppCompatActivity implements StudentAdapter.OnRowClickListener {
    private RecyclerView studentRecyclerView;
    private List<Student> students = new ArrayList<>();
    private StudentAdapter studentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        studentRecyclerView = findViewById(R.id.recycler_view);
        studentRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        Student student1 = new Student("Notes", R.drawable.notes);
        Student student2 = new Student("Syllabus", R.drawable.syllabus);
        Student student3 = new Student("News", R.drawable.news);
        Student student4 = new Student("Colleges", R.drawable.college);
        Student student5 = new Student("Old Questions", R.drawable.old_questions);
        Student student6 = new Student("Solutions", R.drawable.solutions);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        studentAdapter=new StudentAdapter(this,students);
        studentRecyclerView.setAdapter(studentAdapter);
        studentAdapter.setOnRowClickListener(this);
    }

    @Override
    public void onRowClick(int position) {

       switch (position){
           case 0:
               Toast.makeText(this,"clicked at position "+position ,Toast.LENGTH_LONG).show();

           case 1:
               Toast.makeText(this,"clicked at position "+position,Toast.LENGTH_LONG).show();

           case 2:
               Toast.makeText(this,"clicked at position "+position,Toast.LENGTH_LONG).show();

           case 3:
               Toast.makeText(this,"clicked at position "+position,Toast.LENGTH_LONG).show();

           case 4:
               Toast.makeText(this,"clicked at position "+position,Toast.LENGTH_LONG).show();

           case 5:
               Toast.makeText(this,"clicked at position "+position,Toast.LENGTH_LONG).show();
       }
    }
}
