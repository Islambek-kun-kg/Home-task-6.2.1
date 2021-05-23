package com.example.home_task_621

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.home_task_621.extension.isValidUrl
import com.example.home_task_621.extension.loadImage
import com.example.home_task_621.extension.loadRand
import com.example.home_task_621.extension.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var images = mutableListOf(
        "https://i.pinimg.com/originals/94/1a/16/941a1638848c06d3d83139f2ba267c9d.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6a/Mona_Lisa.jpg/400px-Mona_Lisa.jpg",
        "https://static5.depositphotos.com/1011158/432/i/600/depositphotos_4320250-stock-photo-owl-bird-face-close-up.jpg",
        "https://freelance.today/uploads/images/00/07/43/2017/08/25/b1e49d.jpg",
        "https://st2.depositphotos.com/5648852/8240/i/600/depositphotos_82407436-stock-photo-ben-franklin-bridge.jpg"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_submit.setOnClickListener {
            val txt = edt_txt.text.toString()
            if (isValidUrl(txt)) {
                images.add(txt)
                loadImage(txt, img_view)
            } else {
                showToast("Error")
            }
        }
        btn_random.setOnClickListener {
            loadRand(images, img_view)
        }
    }
}