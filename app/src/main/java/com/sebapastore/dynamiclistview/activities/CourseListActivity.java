package com.sebapastore.dynamiclistview.activities;

import android.app.ListActivity;
import android.os.Bundle;

import com.sebapastore.dynamiclistview.R;

/**
 * Created by seba on 04/01/16.
 */
public class CourseListActivity extends ListActivity {
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);

        ImageListAdapter adapter = new ImageListAdapter(this);
        setListAdapter(adapter);

        LoadFeedData loadFeedData = new LoadFeedData(adapter);
        loadFeedData.execute();
    }
}