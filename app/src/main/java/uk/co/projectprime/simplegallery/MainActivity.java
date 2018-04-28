package uk.co.projectprime.simplegallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {

//    Declaring our ImageView
    private ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Initializing the ImageView
        imageView = (ImageView) findViewById(R.id.imageView);





        //Loading Image from URL
        Picasso.with(this)
                .load("https://www.example.com/image001.jpg")
                .placeholder(R.drawable.placeholder)   // optional
                .error(R.drawable.error)      // optional
//                    .resize(500,500)                        // optional
                .fit()  // fit to device screen size
                .centerCrop()  //  maintain ratio of image loaded
                .into(imageView);



    }










}
