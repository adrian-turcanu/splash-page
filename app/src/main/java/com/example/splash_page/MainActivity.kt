package com.example.splash_page

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel("https://i.imgur.com/yK0vCtp.png"))
        imageList.add(SlideModel("https://i.imgur.com/esCogmk.png"))
        imageList.add(SlideModel("https://i.imgur.com/bqfg1jn.png"))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)

    }
}