package com.example.home_task_621.extension

import android.util.Patterns
import android.widget.ImageView
import com.bumptech.glide.Glide
import kotlin.random.Random


fun loadImage(url: String, view: ImageView) {
    Glide.with(view).load(url).into(view)
}

fun isValidUrl(url: String): Boolean = Patterns.WEB_URL.matcher(url).matches()

fun loadRand(images: MutableList<String>, view: ImageView) {
    val count = images.size
    val b = Random.nextInt(count)
    loadImage(images[b], view)
}

