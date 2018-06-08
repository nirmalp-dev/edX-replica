package com.example.nirma.edx;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
public class CourseActivity extends Activity {
    TextView courseName;
    TextView deadline;
    ImageView courseImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        courseName = (TextView)findViewById(R.id.course_name);
        deadline = (TextView)findViewById(R.id.deadline);
        courseImage = (ImageView)findViewById(R.id.course_image);

        courseName.setText("Big Data");
        deadline.setText("Ended");
        courseImage.setImageResource(R.mipmap.bigdata);
    }
}
