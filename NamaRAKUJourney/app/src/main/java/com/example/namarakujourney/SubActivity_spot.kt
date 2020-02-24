package com.example.namarakujourney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_sub_spot.*

class SubActivity_spot : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_spot)

        val btnIntent_curr : Button = BUTTON_CURR_LOCA

        btnIntent_curr.setOnClickListener {
            val intent = Intent(this@SubActivity_spot, SubActivity_spot_genre::class.java)
            // オブジェクトから画面を起動
            startActivity(intent)
        }
    }


}
