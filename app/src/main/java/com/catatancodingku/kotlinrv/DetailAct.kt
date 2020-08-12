package com.catatancodingku.kotlinrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val title = intent.getStringExtra("TITLE")
        val subtitle = intent.getStringExtra("SUBTITLE")
        val foto = intent.getIntExtra("IMAGE",700112)

        iv_detail_image.setImageResource(foto)
        tv_detail_title.text        = title
        tv_detail_subtitle.text     = subtitle
    }
}

