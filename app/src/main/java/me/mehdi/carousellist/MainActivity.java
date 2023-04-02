package me.mehdi.carousellist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.leochuan.CarouselLayoutManager;
import com.leochuan.CenterSnapHelper;
import com.leochuan.CircleLayoutManager;
import com.leochuan.GalleryLayoutManager;
import com.leochuan.ViewPagerLayoutManager;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);

        mRecyclerView.setAdapter(new CarouselAdapter(this));
//        CircleLayoutManager circleLayoutManager = new CircleLayoutManager(this, CircleLayoutManager.BOTTOM, true);
        GalleryLayoutManager galleryLayoutManager = new GalleryLayoutManager(this, 1);
//        galleryLayoutManager.setMoveSpeed(1000);
//        galleryLayoutManager.setMinAlpha(0.500F);
//        galleryLayoutManager.setMaxAlpha(1.000F);
//        galleryLayoutManager.setAngle(30.000F);
        galleryLayoutManager.setEnableBringCenterToFront(true);

        galleryLayoutManager.setFlipRotate(true);
        galleryLayoutManager.setInfinite(true);

        // make the target view stop right at center every time you swipe or drag by:
        // work exactly same as LinearSnapHelper.
        new CenterSnapHelper().attachToRecyclerView(mRecyclerView);
        mRecyclerView.setLayoutManager(galleryLayoutManager);

    }
}
