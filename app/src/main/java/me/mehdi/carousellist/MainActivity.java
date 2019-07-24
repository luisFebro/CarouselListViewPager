package me.mehdi.carousellist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.leochuan.CarouselLayoutManager;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setAdapter(new CarouselAdapter(this));
        mRecyclerView.setLayoutManager(new CarouselLayoutManager(this, 1));
    }
}
