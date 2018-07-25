package com.grass.thatched.trackit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button mTruck, mSupervisor;
    private CardView cardView1;
    private CardView cardView2;
    private ImageView imageView1;
    private ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


//        mTruck=(Button)findViewById(R.id.truck);
//        mSupervisor = (Button)findViewById(R.id.supervisor);
        init();
//

    }

    public void init(){

//        mTruck=(Button)findViewById(R.id.truck);
//        mSupervisor = (Button)findViewById(R.id.supervisor);

        cardView1 = (CardView)findViewById(R.id.cardview1);
        cardView2 = (CardView)findViewById(R.id.cardview2);
//
//
//        imageView1 = (ImageView)findViewById(R.id.image1);
//        imageView2 = (ImageView)findViewById(R.id.image2);

//        imageView1.setImageBitmap(BitmapDescriptorFactory.fromAsset(R.drawable.manager_icon));
//        mTruck.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, TruckLoginActivity.class);
//                startActivity(intent);
//                finish();
//                return;
//            }
//        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TruckLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SupervisorLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
//        mSupervisor.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, SupervisorLoginActivity.class);
//                startActivity(intent);
//                finish();
//                return;
//            }
//        });

//        mCats.add(new Items("Supervisor", R.drawable.ic_launcher_background));
//        mCats.add(new Items("Drivers", R.drawable.ic_launcher_background));
    }



}


