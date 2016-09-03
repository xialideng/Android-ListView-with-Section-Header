package com.example.binhaizhu.listviewwithsectionheader;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends ListActivity {
    private CustomAdapter mAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAdapter = new CustomAdapter(this);
        for (int i = 1; i < 30; i++) {
            mAdapter.addItem("Row Item #" + i);
            if (i % 4 == 0) {
                mAdapter.addSectionHeaderItem("Section #" + i);
            }
        }
        setListAdapter(mAdapter);
    }

}
