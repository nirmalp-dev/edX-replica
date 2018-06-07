package com.example.nirma.edx;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder> {

    public static class PersonViewHolder extends RecyclerView.ViewHolder {

        CardView cn;
        TextView courseName;
        TextView deadline;
        ImageView courseImage;

        PersonViewHolder(View itemView) {
            super(itemView);
            cn = (CardView)itemView.findViewById(R.id.cource_no);
            courseName = (TextView)itemView.findViewById(R.id.course_image);
            deadline = (TextView)itemView.findViewById(R.id.deadline);
            courseImage = (ImageView)itemView.findViewById(R.id.course_image);
        }
    }

    List<Course> courses;

    RVAdapter(List<Course> courses){
        this.courses = courses;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_course_card, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        personViewHolder.courseName.setText(courses.get(i).name);
        personViewHolder.deadline.setText(courses.get(i).age);
        personViewHolder.courseImage.setImageResource(courses.get(i).photoId);
    }

    @Override
    public int getItemCount() {
        return courses.size();
    }
}