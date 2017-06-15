package com.codingblocks.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> studentArrayList;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentArrayList = generateStudents();
        recyclerView = (RecyclerView) findViewById(R.id.rvStudent);
        StudentRecyclerAdapter studentRecyclerAdapter = new StudentRecyclerAdapter(studentArrayList,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(studentRecyclerAdapter);
    }


    static ArrayList<Student> generateStudents(){
        ArrayList<Student> newStudents = new ArrayList<>();

        newStudents.add(new Student("A","Padnora"));
        newStudents.add(new Student("B","Elixir"));
        newStudents.add(new Student("C","Launchpad"));
        newStudents.add(new Student("D","Crux"));
        newStudents.add(new Student("E","Perceptron"));
        newStudents.add(new Student("F","Pandnora"));
        newStudents.add(new Student("G","Pandora"));
        newStudents.add(new Student("H","Elixir"));
        newStudents.add(new Student("A","Padnora"));
        newStudents.add(new Student("B","Elixir"));
        newStudents.add(new Student("C","Launchpad"));
        newStudents.add(new Student("D","Crux"));
        newStudents.add(new Student("E","Perceptron"));
        newStudents.add(new Student("F","Pandnora"));
        newStudents.add(new Student("G","Pandora"));
        newStudents.add(new Student("H","Elixir"));newStudents.add(new Student("A","Padnora"));
        newStudents.add(new Student("B","Elixir"));
        newStudents.add(new Student("C","Launchpad"));
        newStudents.add(new Student("D","Crux"));
        newStudents.add(new Student("E","Perceptron"));
        newStudents.add(new Student("F","Pandnora"));
        newStudents.add(new Student("G","Pandora"));
        newStudents.add(new Student("H","Elixir"));newStudents.add(new Student("A","Padnora"));
        newStudents.add(new Student("B","Elixir"));
        newStudents.add(new Student("C","Launchpad"));
        newStudents.add(new Student("D","Crux"));
        newStudents.add(new Student("E","Perceptron"));
        newStudents.add(new Student("F","Pandnora"));
        newStudents.add(new Student("G","Pandora"));
        newStudents.add(new Student("H","Elixir"));newStudents.add(new Student("A","Padnora"));
        newStudents.add(new Student("B","Elixir"));
        newStudents.add(new Student("C","Launchpad"));
        newStudents.add(new Student("D","Crux"));
        newStudents.add(new Student("E","Perceptron"));
        newStudents.add(new Student("F","Pandnora"));
        newStudents.add(new Student("G","Pandora"));
        newStudents.add(new Student("H","Elixir"));newStudents.add(new Student("A","Padnora"));
        newStudents.add(new Student("B","Elixir"));
        newStudents.add(new Student("C","Launchpad"));
        newStudents.add(new Student("D","Crux"));
        newStudents.add(new Student("E","Perceptron"));
        newStudents.add(new Student("F","Pandnora"));
        newStudents.add(new Student("G","Pandora"));
        newStudents.add(new Student("H","Elixir"));

        return newStudents;

    }
}
